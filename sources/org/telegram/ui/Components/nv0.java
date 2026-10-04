package org.telegram.ui.Components;

import android.content.Context;
public final class nv0 extends mv0 {
    public final ov0 G;

    public nv0(ov0 ov0Var, Context context, int i10) {
        super(ov0Var.f29458e, context, i10, false);
        this.G = ov0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        ov0 ov0Var = this.G;
        pv0 pv0Var = ov0Var.f29458e;
        int i10 = ov0Var.f29455a;
        int[] iArr = pv0.f29748d2;
        iu0 W = pv0Var.W(i10);
        if (W != null && W.f27502r.getVisibility() == 0) {
            ov0Var.d.l();
        }
        if (W != null) {
            zs0 zs0Var = W.f27504w;
            ai.d9 d9Var = this.f28730s;
            if (d9Var != null && (d9Var.k() || (pv0Var.i0() && this.f28730s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zs0Var.e(z10, true);
        }
    }
}
