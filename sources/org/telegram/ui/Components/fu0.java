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
        qu0 W = xv0Var.W(8);
        if (W != null && W.f28680r.getVisibility() == 0) {
            xv0Var.f31349d0.l();
        }
        if (W != null) {
            ht0 ht0Var = W.f28682w;
            bi.o8 o8Var = this.f29784s;
            if (o8Var != null && (o8Var.k() || (xv0Var.i0() && this.f29784s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ht0Var.e(z10, true);
        }
    }
}
