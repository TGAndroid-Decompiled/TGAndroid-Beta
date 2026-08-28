package org.telegram.ui.Components;

import android.content.Context;
public final class tq0 extends bu0 {
    public final eu0 C;

    public tq0(eu0 eu0Var, Context context) {
        super(eu0Var, context, 0, true);
        this.C = eu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        eu0 eu0Var = this.C;
        xs0 W = eu0Var.W(9);
        if (W != null && W.f34761r.getVisibility() == 0) {
            eu0Var.f28124b0.l();
        }
        if (W != null) {
            or0 or0Var = W.f34763w;
            ih.n6 n6Var = this.f27281s;
            if (n6Var != null && (n6Var.k() || (eu0Var.i0() && this.f27281s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            or0Var.e(z10, true);
        }
    }
}
