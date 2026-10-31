package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.u51 f37240a;
    public final org.telegram.ui.ActionBar.p6 f37241b;
    public final int f37242c;
    public final int d;
    public final ag.d3 e;
    public final he f37243f;

    public fe(he heVar, Context context, int i10, int i11, int i12, ag.d3 d3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f37243f = heVar;
        this.d = i10;
        this.f37242c = i11;
        this.f37241b = p6Var;
        this.e = d3Var;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, i11, i12, true, new z4(this, 3), new y0(this, 15), null, p6Var);
        this.f37240a = u51Var;
        setClipChildren(false);
        setClipToPadding(false);
        u51Var.setClipToPadding(false);
        u51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        u51Var.f30819f3.f29295r = false;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u51Var.setOverScrollMode(0);
        addView(u51Var, w7.b6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new bi.t3(3, this, d3Var));
        ei.r rVar = heVar.f37910x.f39195d1;
        if (rVar != null) {
            rVar.b(u51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37240a.f30819f3.O(false);
    }
}
