package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q4 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.mm0 f40619a;
    public p4 f40620b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40619a = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f40619a);
        this.f40619a.setLayoutManager(new s4.b0());
        this.f40619a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f40619a;
        p4 p4Var = new p4(context);
        this.f40620b = p4Var;
        mm0Var2.setAdapter(p4Var);
        this.f40619a.setOnItemClickListener(new h(this, 2));
        frameLayout.addView(this.f40619a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
