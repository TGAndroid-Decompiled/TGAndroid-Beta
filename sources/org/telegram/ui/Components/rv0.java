package org.telegram.ui.Components;

import android.content.Context;
public final class rv0 extends qv0 {
    public final sv0 G;

    public rv0(sv0 sv0Var, Context context, int i10) {
        super(sv0Var.e, context, i10, false);
        this.G = sv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        sv0 sv0Var = this.G;
        tv0 tv0Var = sv0Var.e;
        int i10 = sv0Var.f30335a;
        int[] iArr = tv0.f30680d2;
        mu0 W = tv0Var.W(i10);
        if (W != null && W.f28609r.getVisibility() == 0) {
            sv0Var.d.l();
        }
        if (W != null) {
            dt0 dt0Var = W.f28611w;
            ci.a7 a7Var = this.f29721s;
            if (a7Var != null && (a7Var.k() || (tv0Var.j0() && this.f29721s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            dt0Var.e(z10, true);
        }
    }
}
