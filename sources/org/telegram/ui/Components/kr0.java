package org.telegram.ui.Components;

import android.content.Context;
public final class kr0 extends uu0 {
    public final xu0 G;

    public kr0(xu0 xu0Var, Context context) {
        super(xu0Var, context, 0, true);
        this.G = xu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        xu0 xu0Var = this.G;
        qt0 W = xu0Var.W(9);
        if (W != null && W.f29848r.getVisibility() == 0) {
            xu0Var.f32719f0.l();
        }
        if (W != null) {
            hs0 hs0Var = W.f29850w;
            bi.l8 l8Var = this.f31011s;
            if (l8Var != null && (l8Var.k() || (xu0Var.i0() && this.f31011s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            hs0Var.e(z10, true);
        }
    }
}
