package org.telegram.ui.Components;

import android.content.Context;
public final class mr0 extends vu0 {
    public final yu0 D;

    public mr0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, true);
        this.D = yu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        yu0 yu0Var = this.D;
        qt0 W = yu0Var.W(9);
        if (W != null && W.f30522r.getVisibility() == 0) {
            yu0Var.f33613c0.l();
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
