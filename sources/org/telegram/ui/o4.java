package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.wm0 f40554a;
    public n4 f40555b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f40554a = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40554a);
        this.f40554a.setLayoutManager(new s4.d0());
        this.f40554a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f40554a;
        n4 n4Var = new n4(context);
        this.f40555b = n4Var;
        wm0Var2.setAdapter(n4Var);
        this.f40554a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.f40554a, w7.w5.d(-1.0f, -1));
        return this.fragmentView;
    }
}
