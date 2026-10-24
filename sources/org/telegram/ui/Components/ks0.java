package org.telegram.ui.Components;

import android.content.Context;
public final class ks0 extends tv0 {
    public final wv0 G;

    public ks0(wv0 wv0Var, Context context) {
        super(wv0Var, context, 0, true);
        this.G = wv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        wv0 wv0Var = this.G;
        pu0 X = wv0Var.X(9);
        if (X != null && X.f29677r.getVisibility() == 0) {
            wv0Var.f32375f0.l();
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
