package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ce extends FrameLayout {
    public final org.telegram.ui.Components.b71 f35946a;
    public final org.telegram.ui.ActionBar.d6 f35947b;
    public final int f35948c;
    public final int d;
    public final ah.g e;
    public final ee f35949f;

    public ce(ee eeVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35949f = eeVar;
        this.d = i10;
        this.f35948c = i11;
        this.f35947b = d6Var;
        this.e = gVar;
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(context, i11, i12, true, new g5(this, 3), new b1(this, 13), null, d6Var);
        this.f35946a = b71Var;
        addView(b71Var, w7.z5.c(-1.0f, -1));
        b71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35946a.W2.N(false);
    }
}
