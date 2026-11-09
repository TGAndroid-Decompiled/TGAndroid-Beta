package org.telegram.ui.Components;

import android.content.Context;
public final class ir0 extends ws0 {
    public final zs0 G;

    public ir0(zs0 zs0Var, Context context) {
        super(zs0Var, context, 0, false);
        this.G = zs0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        zs0 zs0Var = this.G;
        ur0 g02 = zs0Var.g0(8);
        if (g02 != null && g02.f38792n.getVisibility() == 0) {
            zs0Var.f41075f0.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.f38795w;
            di.r6 r6Var = this.f40145s;
            if (r6Var != null && (r6Var.k() || (zs0Var.t0() && this.f40145s.g() > 0))) {
                z9 = true;
            } else {
                z9 = false;
            }
            pq0Var.e(z9, true);
        }
    }
}
