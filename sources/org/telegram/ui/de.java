package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.d61 f32615a;
    public final org.telegram.ui.ActionBar.d6 f32616b;
    public final int f32617c;
    public final int d;
    public final ai.o8 e;
    public final fe f32618f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f32618f = feVar;
        this.d = i10;
        this.f32617c = i11;
        this.f32616b = d6Var;
        this.e = o8Var;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i11, i12, true, new c5(this, 3), new z0(this, 13), null, d6Var);
        this.f32615a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new ii.n3(1, this, o8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32615a.Y2.N(false);
    }
}
