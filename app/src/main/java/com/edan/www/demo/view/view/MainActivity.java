package com.edan.www.demo.view.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.edan.www.demo.R;
import com.facebook.rebound.SpringConfig;
import com.jpeng.jpspringmenu.SpringMenu;

/**
 * 创建者     Zhangyu
 * 创建时间   2017/11/7 15:52
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class MainActivity extends AppCompatActivity  {


    private SpringMenu mMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = new SpringMenu(this, R.layout.view_menu);
        mMenu.setMenuSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(20,3));
        mMenu.setChildSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(20, 5));
        mMenu.setFadeEnable(true);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return mMenu.dispatchTouchEvent(ev);
    }


}
