package org.telegram.ui.Components;

import android.content.Context;
public final class rr0 extends ft0 {
    public final it0 H;

    public rr0(it0 it0Var, Context context) {
        super(it0Var, context, 0, false);
        this.H = it0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        it0 it0Var = this.H;
        ds0 g02 = it0Var.g0(8);
        if (g02 != null && g02.f34446n.getVisibility() == 0) {
            it0Var.f36113g0.f();
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
