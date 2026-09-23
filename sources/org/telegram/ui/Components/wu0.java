package org.telegram.ui.Components;

import android.content.Context;
public final class wu0 extends vu0 {
    public final xu0 G;

    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.e, context, i10, false);
        this.G = xu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        xu0 xu0Var = this.G;
        yu0 yu0Var = xu0Var.e;
        int i10 = xu0Var.f30064a;
        int[] iArr = yu0.f30398d2;
        rt0 W = yu0Var.W(i10);
        if (W != null && W.f27728r.getVisibility() == 0) {
            xu0Var.d.l();
        }
        if (W != null) {
            is0 is0Var = W.f27730w;
            ai.d9 d9Var = this.f29394s;
            if (d9Var != null && (d9Var.k() || (yu0Var.i0() && this.f29394s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            is0Var.e(z10, true);
        }
    }
}
