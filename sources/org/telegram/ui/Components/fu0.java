package org.telegram.ui.Components;

import android.content.Context;
public final class fu0 extends uv0 {
    public final xv0 G;

    public fu0(xv0 xv0Var, Context context) {
        super(xv0Var, context, 0, false);
        this.G = xv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        xv0 xv0Var = this.G;
        qu0 X = xv0Var.X(8);
        if (X != null && X.f30004r.getVisibility() == 0) {
            xv0Var.f32669d0.l();
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
