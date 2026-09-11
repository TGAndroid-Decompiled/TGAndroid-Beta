package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.d61 f36005a;
    public final org.telegram.ui.ActionBar.f6 f36006b;
    public final int f36007c;
    public final int d;
    public final ah.g f36008e;
    public final ge f36009f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36009f = geVar;
        this.d = i10;
        this.f36007c = i11;
        this.f36006b = f6Var;
        this.f36008e = gVar;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, f6Var);
        this.f36005a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new ji.l3(1, this, gVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36005a.Y2.N(false);
    }
}
