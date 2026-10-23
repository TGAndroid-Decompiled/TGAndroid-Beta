package org.telegram.ui.Components;

import android.content.Context;
public final class vv0 extends uv0 {
    public final wv0 G;

    public vv0(wv0 wv0Var, Context context, int i10) {
        super(wv0Var.e, context, i10, false);
        this.G = wv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        wv0 wv0Var = this.G;
        xv0 xv0Var = wv0Var.e;
        int i10 = wv0Var.f32355a;
        int[] iArr = xv0.f32656g2;
        qu0 X = xv0Var.X(i10);
        if (X != null && X.f30004r.getVisibility() == 0) {
            wv0Var.d.l();
        }
        if (X != null) {
            ht0 ht0Var = X.f30006w;
            ci.z6 z6Var = this.f31223s;
            if (z6Var != null && (z6Var.k() || (xv0Var.k0() && this.f31223s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ht0Var.e(z10, true);
        }
    }
}
