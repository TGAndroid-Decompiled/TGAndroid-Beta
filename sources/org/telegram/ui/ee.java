package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.l71 f37283a;
    public final org.telegram.ui.ActionBar.e6 f37284b;
    public final int f37285c;
    public final int d;
    public final ai.p8 f37286e;
    public final ge f37287f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37287f = geVar;
        this.d = i10;
        this.f37285c = i11;
        this.f37284b = e6Var;
        this.f37286e = p8Var;
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, e6Var);
        this.f37283a = l71Var;
        addView(l71Var, w7.x5.d(-1.0f, -1));
        l71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37283a.W2.N(false);
    }
}
