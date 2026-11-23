package org.telegram.ui.Components;

import android.content.Context;
public final class sr0 extends gt0 {
    public final jt0 H;

    public sr0(jt0 jt0Var, Context context) {
        super(jt0Var, context, 0, false);
        this.H = jt0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        jt0 jt0Var = this.H;
        ds0 g02 = jt0Var.g0(8);
        if (g02 != null && g02.f34561n.getVisibility() == 0) {
            jt0Var.f36631g0.f();
        }
        if (g02 != null) {
            zq0 zq0Var = g02.f34564w;
            fi.h6 h6Var = this.f35670s;
            if (h6Var != null && (h6Var.k() || (jt0Var.t0() && this.f35670s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zq0Var.e(z10, true);
        }
    }
}
