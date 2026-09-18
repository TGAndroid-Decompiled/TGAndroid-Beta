package org.telegram.ui.Components;

import android.content.Context;
public final class ht0 extends wu0 {
    public final zu0 G;

    public ht0(zu0 zu0Var, Context context) {
        super(zu0Var, context, 0, false);
        this.G = zu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        zu0 zu0Var = this.G;
        st0 W = zu0Var.W(8);
        if (W != null && W.f27925r.getVisibility() == 0) {
            zu0Var.f30620d0.l();
        }
        if (W != null) {
            js0 js0Var = W.f27927w;
            ai.d9 d9Var = this.f29755s;
            if (d9Var != null && (d9Var.k() || (zu0Var.i0() && this.f29755s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            js0Var.e(z10, true);
        }
    }
}
