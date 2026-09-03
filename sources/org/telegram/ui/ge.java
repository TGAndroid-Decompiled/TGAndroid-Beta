package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.g61 f34421a;
    public final org.telegram.ui.ActionBar.f6 f34422b;
    public final int f34423c;
    public final int d;
    public final ah.b e;
    public final ie f34424f;

    public ge(ie ieVar, Context context, int i10, int i11, int i12, ah.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34424f = ieVar;
        this.d = i10;
        this.f34423c = i11;
        this.f34422b = f6Var;
        this.e = bVar;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i11, i12, true, new f5(this, 3), new c1(this, 13), null, f6Var);
        this.f34421a = g61Var;
        addView(g61Var, k7.b6.c(-1.0f, -1));
        g61Var.setOnScrollListener(new jh.l(2, this, bVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34421a.V2.N(false);
    }
}
