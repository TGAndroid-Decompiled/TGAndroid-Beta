package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.h61 f36450a;
    public final org.telegram.ui.ActionBar.g6 f36451b;
    public final int f36452c;
    public final int d;
    public final af.b f36453e;
    public final ge f36454f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, af.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36454f = geVar;
        this.d = i10;
        this.f36452c = i11;
        this.f36451b = g6Var;
        this.f36453e = bVar;
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, g6Var);
        this.f36450a = h61Var;
        addView(h61Var, k7.c6.c(-1.0f, -1));
        h61Var.setOnScrollListener(new kh.l(2, this, bVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36450a.V2.N(false);
    }
}
