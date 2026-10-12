package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q4 extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.mm0 f39336a;
    public p4 f39337b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 21));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39336a = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39336a);
        this.f39336a.setLayoutManager(new s4.b0());
        this.f39336a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39336a;
        p4 p4Var = new p4(context);
        this.f39337b = p4Var;
        mm0Var2.setAdapter(p4Var);
        this.f39336a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.f39336a, w7.a6.d(-1.0f, -1));
        return this.fragmentView;
    }
}
