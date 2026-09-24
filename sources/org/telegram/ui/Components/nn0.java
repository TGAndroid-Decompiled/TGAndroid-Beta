package org.telegram.ui.Components;

import android.view.View;
public final class nn0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        tn0 tn0Var;
        sn0 sn0Var;
        View view = c1Var.f42946a;
        if ((view instanceof tn0) && (sn0Var = (tn0Var = (tn0) view).f28565a) != null) {
            sn0Var.f49363i = sn0Var.N;
            sn0Var.f49361g = sn0Var.O;
            sn0Var.h = sn0Var.P;
            tn0Var.f28566b.d(0.0f, true);
            tn0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(c1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(c1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f43006r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
