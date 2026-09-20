package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.s61 f33319a;
    public final org.telegram.ui.ActionBar.f6 f33320b;
    public final int f33321c;
    public final int d;
    public final ai.n8 e;
    public final ge f33322f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33322f = geVar;
        this.d = i10;
        this.f33321c = i11;
        this.f33320b = f6Var;
        this.e = n8Var;
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, f6Var);
        this.f33319a = s61Var;
        addView(s61Var, w7.y5.c(-1.0f, -1));
        s61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33319a.Y2.N(false);
    }
}
