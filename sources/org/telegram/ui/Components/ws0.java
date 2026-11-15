package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 extends vs0 {
    public final xs0 H;

    public ws0(xs0 xs0Var, Context context, int i7) {
        super(xs0Var.f41761e, context, i7, false);
        this.H = xs0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        xs0 xs0Var = this.H;
        ys0 ys0Var = xs0Var.f41761e;
        int i7 = xs0Var.f41758a;
        int[] iArr = ys0.f42071t2;
        tr0 g02 = ys0Var.g0(i7);
        if (g02 != null && g02.f39795n.getVisibility() == 0) {
            xs0Var.d.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.f39798w;
            fi.k6 k6Var = this.f41146s;
            if (k6Var != null && (k6Var.k() || (ys0Var.t0() && this.f41146s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pq0Var.e(z10, true);
        }
    }
}
