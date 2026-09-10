package org.telegram.ui.Components;

import android.content.Context;
public final class ur0 extends fv0 {
    public final iv0 G;

    public ur0(iv0 iv0Var, Context context) {
        super(iv0Var, context, 0, true);
        this.G = iv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        iv0 iv0Var = this.G;
        au0 W = iv0Var.W(9);
        if (W != null && W.f21595r.getVisibility() == 0) {
            iv0Var.f24097f0.l();
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
