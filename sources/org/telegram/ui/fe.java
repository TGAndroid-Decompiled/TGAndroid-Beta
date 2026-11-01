package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.v51 f37112a;
    public final org.telegram.ui.ActionBar.p6 f37113b;
    public final int f37114c;
    public final int d;
    public final ag.d3 e;
    public final he f37115f;

    public fe(he heVar, Context context, int i10, int i11, int i12, ag.d3 d3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f37115f = heVar;
        this.d = i10;
        this.f37114c = i11;
        this.f37113b = p6Var;
        this.e = d3Var;
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, i11, i12, true, new z4(this, 3), new y0(this, 15), null, p6Var);
        this.f37112a = v51Var;
        setClipChildren(false);
        setClipToPadding(false);
        v51Var.setClipToPadding(false);
        v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        v51Var.f31183f3.f29638r = false;
        v51Var.setCaptureSectionsDecoratorAllowed(true);
        v51Var.setOverScrollMode(0);
        addView(v51Var, w7.b6.c(-1.0f, -1));
        v51Var.setOnScrollListener(new bi.t3(3, this, d3Var));
        ei.r rVar = heVar.f37803x.f39204d1;
        if (rVar != null) {
            rVar.b(v51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37112a.f31183f3.O(false);
    }
}
