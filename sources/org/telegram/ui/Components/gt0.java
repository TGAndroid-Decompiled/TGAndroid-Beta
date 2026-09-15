package org.telegram.ui.Components;

import android.content.Context;
public final class gt0 extends vu0 {
    public final yu0 G;

    public gt0(yu0 yu0Var, Context context) {
        super(yu0Var, context, 0, false);
        this.G = yu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        yu0 yu0Var = this.G;
        rt0 W = yu0Var.W(8);
        if (W != null && W.f27688r.getVisibility() == 0) {
            yu0Var.f30353d0.l();
        }
        if (W != null) {
            is0 is0Var = W.f27690w;
            ai.d9 d9Var = this.f29441s;
            if (d9Var != null && (d9Var.k() || (yu0Var.i0() && this.f29441s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            is0Var.e(z10, true);
        }
    }
}
