package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.l71 f37027a;
    public final org.telegram.ui.ActionBar.d6 f37028b;
    public final int f37029c;
    public final int d;
    public final ai.p8 f37030e;
    public final fe f37031f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f37031f = feVar;
        this.d = i10;
        this.f37029c = i11;
        this.f37028b = d6Var;
        this.f37030e = p8Var;
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(context, i11, i12, true, new a5(this, 3), new y0(this, 13), null, d6Var);
        this.f37027a = l71Var;
        addView(l71Var, w7.x5.d(-1.0f, -1));
        l71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37027a.W2.N(false);
    }
}
