package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ie extends FrameLayout {
    public final org.telegram.ui.Components.p71 f38880a;
    public final org.telegram.ui.ActionBar.c6 f38881b;
    public final int f38882c;
    public final int d;
    public final ai.p8 f38883e;
    public final ke f38884f;

    public ie(ke keVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38884f = keVar;
        this.d = i10;
        this.f38882c = i11;
        this.f38881b = c6Var;
        this.f38883e = p8Var;
        org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(context, i11, i12, true, new e5(this, 3), new z0(this, 13), null, c6Var);
        this.f38880a = p71Var;
        addView(p71Var, w7.w5.d(-1.0f, -1));
        p71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38880a.W2.N(false);
    }
}
