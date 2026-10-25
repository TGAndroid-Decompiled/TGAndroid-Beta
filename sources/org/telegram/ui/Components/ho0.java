package org.telegram.ui.Components;

import android.view.View;
public final class ho0 extends s4.l {
    @Override
    public final boolean r(s4.e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        no0 no0Var;
        mo0 mo0Var;
        View view = e1Var.f47735a;
        if ((view instanceof no0) && (mo0Var = (no0Var = (no0) view).f31047a) != null) {
            mo0Var.f4175i = mo0Var.N;
            mo0Var.f4173g = mo0Var.O;
            mo0Var.h = mo0Var.P;
            no0Var.f31048b.d(0.0f, true);
            no0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f47787r.add(new s4.k(e1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.e1 e1Var) {
        return true;
    }
}
