package org.telegram.ui.Components;

import android.content.Context;
public final class ou0 extends nu0 {
    public final pu0 C;

    public ou0(pu0 pu0Var, Context context, int i10) {
        super(pu0Var.f31776e, context, i10, false);
        this.C = pu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        pu0 pu0Var = this.C;
        qu0 qu0Var = pu0Var.f31776e;
        int i10 = pu0Var.f31773a;
        int[] iArr = qu0.Z1;
        it0 W = qu0Var.W(i10);
        if (W != null && W.f29469r.getVisibility() == 0) {
            pu0Var.d.l();
        }
        if (W != null) {
            zr0 zr0Var = W.f29471w;
            lh.k6 k6Var = this.f31151s;
            if (k6Var != null && (k6Var.k() || (qu0Var.i0() && this.f31151s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zr0Var.e(z10, true);
        }
    }
}
