package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.f61 f33624a;
    public final org.telegram.ui.ActionBar.f6 f33625b;
    public final int f33626c;
    public final int d;
    public final ai.n8 e;
    public final he f33627f;

    public fe(he heVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33627f = heVar;
        this.d = i10;
        this.f33626c = i11;
        this.f33625b = f6Var;
        this.e = n8Var;
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, f6Var);
        this.f33624a = f61Var;
        addView(f61Var, w7.x5.c(-1.0f, -1));
        f61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33624a.Y2.N(false);
    }
}
