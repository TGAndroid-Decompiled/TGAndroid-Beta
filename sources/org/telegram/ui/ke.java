package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ke extends FrameLayout {
    public final org.telegram.ui.Components.i71 f37355a;
    public final org.telegram.ui.ActionBar.c6 f37356b;
    public final int f37357c;
    public final int d;
    public final ah.g e;
    public final me f37358f;

    public ke(me meVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37358f = meVar;
        this.d = i10;
        this.f37357c = i11;
        this.f37356b = c6Var;
        this.e = gVar;
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, i11, i12, true, new f5(this, 3), new b1(this, 13), null, c6Var);
        this.f37355a = i71Var;
        addView(i71Var, w7.z5.d(-1.0f, -1));
        i71Var.setOnScrollListener(new ji.n3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37355a.W2.N(false);
    }
}
