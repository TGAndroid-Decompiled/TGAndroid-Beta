package org.telegram.ui.Components;

import android.content.Context;
public final class ov0 extends nv0 {
    public final pv0 G;

    public ov0(pv0 pv0Var, Context context, int i10) {
        super(pv0Var.f29853e, context, i10, false);
        this.G = pv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        pv0 pv0Var = this.G;
        qv0 qv0Var = pv0Var.f29853e;
        int i10 = pv0Var.f29850a;
        int[] iArr = qv0.f30210d2;
        ju0 W = qv0Var.W(i10);
        if (W != null && W.f27977r.getVisibility() == 0) {
            pv0Var.d.l();
        }
        if (W != null) {
            at0 at0Var = W.f27979w;
            ai.d9 d9Var = this.f29158s;
            if (d9Var != null && (d9Var.k() || (qv0Var.i0() && this.f29158s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            at0Var.e(z10, true);
        }
    }
}
