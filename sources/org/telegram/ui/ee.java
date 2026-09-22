package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.u61 f33339a;
    public final org.telegram.ui.ActionBar.f6 f33340b;
    public final int f33341c;
    public final int d;
    public final ai.n8 e;
    public final ge f33342f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33342f = geVar;
        this.d = i10;
        this.f33341c = i11;
        this.f33340b = f6Var;
        this.e = n8Var;
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, f6Var);
        this.f33339a = u61Var;
        addView(u61Var, w7.y5.c(-1.0f, -1));
        u61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33339a.Y2.N(false);
    }
}
