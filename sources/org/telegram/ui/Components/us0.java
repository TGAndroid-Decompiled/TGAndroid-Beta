package org.telegram.ui.Components;

import android.content.Context;
public final class us0 extends yv0 {
    public final bw0 G;

    public us0(bw0 bw0Var, Context context) {
        super(bw0Var, context, 0, true);
        this.G = bw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        bw0 bw0Var = this.G;
        uu0 d02 = bw0Var.d0(9);
        if (d02 != null && d02.f33468n.getVisibility() == 0) {
            bw0Var.f26948h0.l();
        }
        if (d02 != null) {
            pt0 pt0Var = d02.v;
            di.z6 z6Var = this.f35173s;
            if (z6Var != null && (z6Var.k() || (bw0Var.q0() && this.f35173s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pt0Var.e(z10, true);
        }
    }
}
