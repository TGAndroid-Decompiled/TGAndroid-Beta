package org.telegram.ui.Components;

import android.content.Context;
public final class uq0 extends xt0 {
    public final au0 G;

    public uq0(au0 au0Var, Context context) {
        super(au0Var, context, 0, true);
        this.G = au0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        au0 au0Var = this.G;
        ts0 f02 = au0Var.f0(9);
        if (f02 != null && f02.f30719n.getVisibility() == 0) {
            au0Var.f24521h0.f();
        }
        if (f02 != null) {
            pr0 pr0Var = f02.f30722w;
            th.x4 x4Var = this.f32635s;
            if (x4Var != null && (x4Var.k() || (au0Var.s0() && this.f32635s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pr0Var.e(z10, true);
        }
    }
}
