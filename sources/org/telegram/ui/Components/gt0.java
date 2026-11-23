package org.telegram.ui.Components;

import android.content.Context;
public final class gt0 extends ft0 {
    public final ht0 H;

    public gt0(ht0 ht0Var, Context context, int i7) {
        super(ht0Var.f35819e, context, i7, false);
        this.H = ht0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        ht0 ht0Var = this.H;
        it0 it0Var = ht0Var.f35819e;
        int i7 = ht0Var.f35816a;
        int[] iArr = it0.f36087t2;
        ds0 g02 = it0Var.g0(i7);
        if (g02 != null && g02.f34446n.getVisibility() == 0) {
            ht0Var.d.f();
        }
        if (g02 != null) {
            yq0 yq0Var = g02.f34449w;
            fi.h6 h6Var = this.f35199s;
            if (h6Var != null && (h6Var.k() || (it0Var.t0() && this.f35199s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            yq0Var.e(z10, true);
        }
    }
}
