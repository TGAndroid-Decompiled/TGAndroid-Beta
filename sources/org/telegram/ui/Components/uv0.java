package org.telegram.ui.Components;

import android.content.Context;
public final class uv0 extends tv0 {
    public final vv0 G;

    public uv0(vv0 vv0Var, Context context, int i10) {
        super(vv0Var.e, context, i10, false);
        this.G = vv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        vv0 vv0Var = this.G;
        wv0 wv0Var = vv0Var.e;
        int i10 = vv0Var.f32053a;
        int[] iArr = wv0.f32355g2;
        pu0 X = wv0Var.X(i10);
        if (X != null && X.f29677r.getVisibility() == 0) {
            vv0Var.d.l();
        }
        if (X != null) {
            gt0 gt0Var = X.f29679w;
            ci.z6 z6Var = this.f30902s;
            if (z6Var != null && (z6Var.k() || (wv0Var.k0() && this.f30902s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            gt0Var.e(z10, true);
        }
    }
}
