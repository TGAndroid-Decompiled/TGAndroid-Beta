package org.telegram.ui.Components;

import android.content.Context;
public final class nr0 extends wu0 {
    public final zu0 D;

    public nr0(zu0 zu0Var, Context context) {
        super(zu0Var, context, 0, true);
        this.D = zu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        zu0 zu0Var = this.D;
        rt0 W = zu0Var.W(9);
        if (W != null && W.f30850r.getVisibility() == 0) {
            zu0Var.f33968c0.l();
        }
        if (W != null) {
            is0 is0Var = W.f30852w;
            oh.l6 l6Var = this.f32857s;
            if (l6Var != null && (l6Var.k() || (zu0Var.i0() && this.f32857s.g() > 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            is0Var.e(z4, true);
        }
    }
}
