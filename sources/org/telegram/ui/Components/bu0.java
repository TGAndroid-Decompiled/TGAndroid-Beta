package org.telegram.ui.Components;

import android.content.Context;
public final class bu0 extends qv0 {
    public final tv0 G;

    public bu0(tv0 tv0Var, Context context) {
        super(tv0Var, context, 0, false);
        this.G = tv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        tv0 tv0Var = this.G;
        mu0 W = tv0Var.W(8);
        if (W != null && W.f28609r.getVisibility() == 0) {
            tv0Var.f30693d0.l();
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
