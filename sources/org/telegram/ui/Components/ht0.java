package org.telegram.ui.Components;

import android.content.Context;
public final class ht0 extends gt0 {
    public final it0 H;

    public ht0(it0 it0Var, Context context, int i7) {
        super(it0Var.f36269e, context, i7, false);
        this.H = it0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        it0 it0Var = this.H;
        jt0 jt0Var = it0Var.f36269e;
        int i7 = it0Var.f36266a;
        int[] iArr = jt0.f36559t2;
        ds0 g02 = jt0Var.g0(i7);
        if (g02 != null && g02.f34540n.getVisibility() == 0) {
            it0Var.d.f();
        }
        if (g02 != null) {
            zq0 zq0Var = g02.f34543w;
            fi.h6 h6Var = this.f35630s;
            if (h6Var != null && (h6Var.k() || (jt0Var.t0() && this.f35630s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zq0Var.e(z10, true);
        }
    }
}
