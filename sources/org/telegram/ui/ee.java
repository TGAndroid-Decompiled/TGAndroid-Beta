package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.a71 f36471a;
    public final org.telegram.ui.ActionBar.d6 f36472b;
    public final int f36473c;
    public final int d;
    public final ah.g e;
    public final ge f36474f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36474f = geVar;
        this.d = i10;
        this.f36473c = i11;
        this.f36472b = d6Var;
        this.e = gVar;
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(context, i11, i12, true, new g5(this, 3), new b1(this, 13), null, d6Var);
        this.f36471a = a71Var;
        addView(a71Var, w7.z5.c(-1.0f, -1));
        a71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36471a.W2.N(false);
    }
}
