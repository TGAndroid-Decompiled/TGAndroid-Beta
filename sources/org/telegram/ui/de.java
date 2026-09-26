package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.s61 f33082a;
    public final org.telegram.ui.ActionBar.d6 f33083b;
    public final int f33084c;
    public final int d;
    public final ai.o8 e;
    public final fe f33085f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f33085f = feVar;
        this.d = i10;
        this.f33084c = i11;
        this.f33083b = d6Var;
        this.e = o8Var;
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, d6Var);
        this.f33082a = s61Var;
        addView(s61Var, w7.y5.c(-1.0f, -1));
        s61Var.setOnScrollListener(new ii.n3(1, this, o8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33082a.Y2.N(false);
    }
}
