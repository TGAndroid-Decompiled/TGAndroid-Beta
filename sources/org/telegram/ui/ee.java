package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.d61 f36033a;
    public final org.telegram.ui.ActionBar.f6 f36034b;
    public final int f36035c;
    public final int d;
    public final ah.g f36036e;
    public final ge f36037f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36037f = geVar;
        this.d = i10;
        this.f36035c = i11;
        this.f36034b = f6Var;
        this.f36036e = gVar;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, f6Var);
        this.f36033a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new ji.l3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36033a.Y2.N(false);
    }
}
