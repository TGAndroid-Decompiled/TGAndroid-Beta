package org.telegram.ui.Components;

import android.content.Context;
public final class wu0 extends vu0 {
    public final xu0 D;

    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.e, context, i10, false);
        this.D = xu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        xu0 xu0Var = this.D;
        yu0 yu0Var = xu0Var.e;
        int i10 = xu0Var.f30728a;
        int[] iArr = yu0.a2;
        qt0 W = yu0Var.W(i10);
        if (W != null && W.f28242r.getVisibility() == 0) {
            xu0Var.d.l();
        }
        if (W != null) {
            hs0 hs0Var = W.f28244w;
            nh.l6 l6Var = this.f30091s;
            if (l6Var != null && (l6Var.k() || (yu0Var.i0() && this.f30091s.g() > 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            hs0Var.e(z4, true);
        }
    }
}
