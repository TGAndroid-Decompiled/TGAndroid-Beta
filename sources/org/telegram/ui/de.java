package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.m71 f36993a;
    public final org.telegram.ui.ActionBar.d6 f36994b;
    public final int f36995c;
    public final int d;
    public final ai.p8 f36996e;
    public final fe f36997f;

    public de(fe feVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36997f = feVar;
        this.d = i10;
        this.f36995c = i11;
        this.f36994b = d6Var;
        this.f36996e = p8Var;
        org.telegram.ui.Components.m71 m71Var = new org.telegram.ui.Components.m71(context, i11, i12, true, new a5(this, 3), new y0(this, 13), null, d6Var);
        this.f36993a = m71Var;
        addView(m71Var, w7.x5.d(-1.0f, -1));
        m71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36993a.W2.N(false);
    }
}
