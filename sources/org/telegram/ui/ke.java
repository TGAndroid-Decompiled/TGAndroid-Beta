package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ke extends FrameLayout {
    public final org.telegram.ui.Components.h71 f37629a;
    public final org.telegram.ui.ActionBar.c6 f37630b;
    public final int f37631c;
    public final int d;
    public final ah.g e;
    public final me f37632f;

    public ke(me meVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37632f = meVar;
        this.d = i10;
        this.f37631c = i11;
        this.f37630b = c6Var;
        this.e = gVar;
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(context, i11, i12, true, new f5(this, 3), new b1(this, 13), null, c6Var);
        this.f37629a = h71Var;
        addView(h71Var, w7.a6.d(-1.0f, -1));
        h71Var.setOnScrollListener(new ji.n3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37629a.W2.N(false);
    }
}
