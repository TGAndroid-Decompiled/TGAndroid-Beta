package org.telegram.ui.Components;

import android.content.Context;
public final class xu0 extends wu0 {
    public final yu0 D;

    public xu0(yu0 yu0Var, Context context, int i10) {
        super(yu0Var.f33582e, context, i10, false);
        this.D = yu0Var;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        yu0 yu0Var = this.D;
        zu0 zu0Var = yu0Var.f33582e;
        int i10 = yu0Var.f33579a;
        int[] iArr = zu0.a2;
        rt0 W = zu0Var.W(i10);
        if (W != null && W.f30850r.getVisibility() == 0) {
            yu0Var.d.l();
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
