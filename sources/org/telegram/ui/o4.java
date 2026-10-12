package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.wm0 f40557a;
    public n4 f40558b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f40557a = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40557a);
        this.f40557a.setLayoutManager(new s4.d0());
        this.f40557a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f40557a;
        n4 n4Var = new n4(context);
        this.f40558b = n4Var;
        wm0Var2.setAdapter(n4Var);
        this.f40557a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.f40557a, w7.w5.d(-1.0f, -1));
        return this.fragmentView;
    }
}
