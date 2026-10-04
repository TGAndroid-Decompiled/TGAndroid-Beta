package org.telegram.ui.Components;

import android.view.View;
public final class tn0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        zn0 zn0Var;
        yn0 yn0Var;
        View view = c1Var.f46531a;
        if ((view instanceof zn0) && (yn0Var = (zn0Var = (zn0) view).f33581a) != null) {
            yn0Var.f53462i = yn0Var.N;
            yn0Var.f53460g = yn0Var.O;
            yn0Var.h = yn0Var.P;
            zn0Var.f33582b.d(0.0f, true);
            zn0Var.invalidate();
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
        this.f46599r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
