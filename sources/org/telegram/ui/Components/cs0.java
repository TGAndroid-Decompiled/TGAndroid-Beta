package org.telegram.ui.Components;

import android.content.Context;
public final class cs0 extends mv0 {
    public final pv0 G;

    public cs0(pv0 pv0Var, Context context) {
        super(pv0Var, context, 0, true);
        this.G = pv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        pv0 pv0Var = this.G;
        iu0 W = pv0Var.W(9);
        if (W != null && W.f27501r.getVisibility() == 0) {
            pv0Var.f29766f0.l();
        }
        if (W != null) {
            zs0 zs0Var = W.f27503w;
            ai.d9 d9Var = this.f28729s;
            if (d9Var != null && (d9Var.k() || (pv0Var.i0() && this.f28729s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zs0Var.e(z10, true);
        }
    }
}
