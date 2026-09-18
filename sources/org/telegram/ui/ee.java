package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.t61 f33263a;
    public final org.telegram.ui.ActionBar.e6 f33264b;
    public final int f33265c;
    public final int d;
    public final ai.n8 e;
    public final ge f33266f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33266f = geVar;
        this.d = i10;
        this.f33265c = i11;
        this.f33264b = e6Var;
        this.e = n8Var;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, e6Var);
        this.f33263a = t61Var;
        addView(t61Var, w7.y5.c(-1.0f, -1));
        t61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33263a.Y2.N(false);
    }
}
