package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.r61 f33084a;
    public final org.telegram.ui.ActionBar.d6 f33085b;
    public final int f33086c;
    public final int d;
    public final ai.o8 e;
    public final fe f33087f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f33087f = feVar;
        this.d = i10;
        this.f33086c = i11;
        this.f33085b = d6Var;
        this.e = o8Var;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, d6Var);
        this.f33084a = r61Var;
        addView(r61Var, w7.y5.c(-1.0f, -1));
        r61Var.setOnScrollListener(new ii.n3(1, this, o8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33084a.Y2.N(false);
    }
}
