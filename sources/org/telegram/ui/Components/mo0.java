package org.telegram.ui.Components;

import android.view.View;
public final class mo0 extends s4.j {
    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        so0 so0Var;
        ro0 ro0Var;
        View view = d1Var.f47889a;
        if ((view instanceof so0) && (ro0Var = (so0Var = (so0) view).f30598a) != null) {
            ro0Var.f54817i = ro0Var.N;
            ro0Var.f54815g = ro0Var.O;
            ro0Var.h = ro0Var.P;
            so0Var.f30599b.d(0.0f, true);
            so0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(d1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(d1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f47952r.add(new s4.i(d1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.d1 d1Var) {
        return true;
    }
}
