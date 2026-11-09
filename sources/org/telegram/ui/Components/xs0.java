package org.telegram.ui.Components;

import android.content.Context;
public final class xs0 extends ws0 {
    public final ys0 G;

    public xs0(ys0 ys0Var, Context context, int i7) {
        super(ys0Var.f40803e, context, i7, false);
        this.G = ys0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        ys0 ys0Var = this.G;
        zs0 zs0Var = ys0Var.f40803e;
        int i7 = ys0Var.f40800a;
        int[] iArr = zs0.f41052s2;
        ur0 g02 = zs0Var.g0(i7);
        if (g02 != null && g02.f38792n.getVisibility() == 0) {
            ys0Var.d.f();
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
