package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.i61 f36553a;
    public final org.telegram.ui.ActionBar.g6 f36554b;
    public final int f36555c;
    public final int d;
    public final af.b f36556e;
    public final ge f36557f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, af.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36557f = geVar;
        this.d = i10;
        this.f36555c = i11;
        this.f36554b = g6Var;
        this.f36556e = bVar;
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, g6Var);
        this.f36553a = i61Var;
        addView(i61Var, k7.c6.c(-1.0f, -1));
        i61Var.setOnScrollListener(new kh.l(2, this, bVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36553a.V2.N(false);
    }
}
