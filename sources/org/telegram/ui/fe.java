package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.r61 f32788a;
    public final org.telegram.ui.ActionBar.f6 f32789b;
    public final int f32790c;
    public final int d;
    public final bi.s e;
    public final he f32791f;

    public fe(he heVar, Context context, int i10, int i11, int i12, bi.s sVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f32791f = heVar;
        this.d = i10;
        this.f32790c = i11;
        this.f32789b = f6Var;
        this.e = sVar;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i11, i12, true, new b5(this, 3), new a1(this, 13), null, f6Var);
        this.f32788a = r61Var;
        addView(r61Var, w7.a6.c(-1.0f, -1));
        r61Var.setOnScrollListener(new hi.p3(1, this, sVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32788a.Y2.N(false);
    }
}
