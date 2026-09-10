package org.telegram.ui.Components;

import android.content.Context;
public final class gv0 extends fv0 {
    public final hv0 G;

    public gv0(hv0 hv0Var, Context context, int i10) {
        super(hv0Var.e, context, i10, false);
        this.G = hv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        hv0 hv0Var = this.G;
        iv0 iv0Var = hv0Var.e;
        int i10 = hv0Var.f23765a;
        int[] iArr = iv0.f24079d2;
        au0 W = iv0Var.W(i10);
        if (W != null && W.f21595r.getVisibility() == 0) {
            hv0Var.d.l();
        }
        if (W != null) {
            rs0 rs0Var = W.f21597w;
            zh.a5 a5Var = this.f23089s;
            if (a5Var != null && (a5Var.k() || (iv0Var.i0() && this.f23089s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            rs0Var.e(z10, true);
        }
    }
}
