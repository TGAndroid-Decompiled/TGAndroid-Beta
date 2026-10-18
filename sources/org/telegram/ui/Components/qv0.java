package org.telegram.ui.Components;

import android.content.Context;
public final class qv0 extends pv0 {
    public final rv0 G;

    public qv0(rv0 rv0Var, Context context, int i10) {
        super(rv0Var.e, context, i10, false);
        this.G = rv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        rv0 rv0Var = this.G;
        sv0 sv0Var = rv0Var.e;
        int i10 = rv0Var.f30065a;
        int[] iArr = sv0.f30343d2;
        lu0 W = sv0Var.W(i10);
        if (W != null && W.f28339r.getVisibility() == 0) {
            rv0Var.d.l();
        }
        if (W != null) {
            ct0 ct0Var = W.f28341w;
            ci.a7 a7Var = this.f29442s;
            if (a7Var != null && (a7Var.k() || (sv0Var.j0() && this.f29442s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ct0Var.e(z10, true);
        }
    }
}
