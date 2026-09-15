package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.e61 f32996a;
    public final org.telegram.ui.ActionBar.e6 f32997b;
    public final int f32998c;
    public final int d;
    public final ai.n8 e;
    public final fe f32999f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32999f = feVar;
        this.d = i10;
        this.f32998c = i11;
        this.f32997b = e6Var;
        this.e = n8Var;
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(context, i11, i12, true, new b5(this, 3), new y0(this, 13), null, e6Var);
        this.f32996a = e61Var;
        addView(e61Var, w7.x5.c(-1.0f, -1));
        e61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32996a.Y2.N(false);
    }
}
