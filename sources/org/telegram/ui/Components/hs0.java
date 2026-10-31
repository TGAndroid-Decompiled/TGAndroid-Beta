package org.telegram.ui.Components;

import android.content.Context;
public final class hs0 extends wt0 {
    public final zt0 G;

    public hs0(zt0 zt0Var, Context context) {
        super(zt0Var, context, 0, false);
        this.G = zt0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        zt0 zt0Var = this.G;
        ss0 e02 = zt0Var.e0(8);
        if (e02 != null && e02.f30352n.getVisibility() == 0) {
            zt0Var.f33187f0.f();
        }
        if (e02 != null) {
            or0 or0Var = e02.f30355w;
            th.x4 x4Var = this.f32251s;
            if (x4Var != null && (x4Var.k() || (zt0Var.r0() && this.f32251s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            or0Var.e(z10, true);
        }
    }
}
