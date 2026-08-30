package org.telegram.ui.Components;

import android.content.Context;
public final class ft0 extends vu0 {
    public final yu0 D;

    public ft0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, false);
        this.D = yu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        yu0 yu0Var = this.D;
        qt0 W = yu0Var.W(8);
        if (W != null && W.f28242r.getVisibility() == 0) {
            yu0Var.f31103a0.l();
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
