package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.g61 f33998a;
    public final org.telegram.ui.ActionBar.f6 f33999b;
    public final int f34000c;
    public final int d;
    public final af.b e;
    public final ge f34001f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, af.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34001f = geVar;
        this.d = i10;
        this.f34000c = i11;
        this.f33999b = f6Var;
        this.e = bVar;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, f6Var);
        this.f33998a = g61Var;
        addView(g61Var, k7.b6.c(-1.0f, -1));
        g61Var.setOnScrollListener(new jh.l(2, this, bVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33998a.V2.N(false);
    }
}
