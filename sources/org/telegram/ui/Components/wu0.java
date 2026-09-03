package org.telegram.ui.Components;

import android.content.Context;
public final class wu0 extends vu0 {
    public final xu0 D;

    public wu0(xu0 xu0Var, Context context, int i10) {
        super(xu0Var.f33180e, context, i10, false);
        this.D = xu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        xu0 xu0Var = this.D;
        yu0 yu0Var = xu0Var.f33180e;
        int i10 = xu0Var.f33177a;
        int[] iArr = yu0.a2;
        qt0 W = yu0Var.W(i10);
        if (W != null && W.f30522r.getVisibility() == 0) {
            xu0Var.d.l();
        }
        if (W != null) {
            hs0 hs0Var = W.f30524w;
            oh.l6 l6Var = this.f32551s;
            if (l6Var != null && (l6Var.k() || (yu0Var.i0() && this.f32551s.g() > 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            hs0Var.e(z4, true);
        }
    }
}
