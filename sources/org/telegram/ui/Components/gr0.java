package org.telegram.ui.Components;

import android.content.Context;
public final class gr0 extends us0 {
    public final xs0 G;

    public gr0(xs0 xs0Var, Context context) {
        super(xs0Var, context, 0, false);
        this.G = xs0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        xs0 xs0Var = this.G;
        sr0 g02 = xs0Var.g0(8);
        if (g02 != null && g02.f38110n.getVisibility() == 0) {
            xs0Var.f40388f0.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.f38113w;
            di.q6 q6Var = this.f38717s;
            if (q6Var != null && (q6Var.k() || (xs0Var.t0() && this.f38717s.g() > 0))) {
                z9 = true;
            } else {
                z9 = false;
            }
            nq0Var.e(z9, true);
        }
    }
}
