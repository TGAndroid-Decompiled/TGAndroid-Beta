package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ce extends FrameLayout {
    public final org.telegram.ui.Components.j71 f36339a;
    public final org.telegram.ui.ActionBar.g6 f36340b;
    public final int f36341c;
    public final int d;
    public final ah.g e;
    public final ee f36342f;

    public ce(ee eeVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36342f = eeVar;
        this.d = i10;
        this.f36341c = i11;
        this.f36340b = g6Var;
        this.e = gVar;
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context, i11, i12, true, new f5(this, 3), new a1(this, 13), null, g6Var);
        this.f36339a = j71Var;
        addView(j71Var, w7.z5.c(-1.0f, -1));
        j71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36339a.Z2.N(false);
    }
}
