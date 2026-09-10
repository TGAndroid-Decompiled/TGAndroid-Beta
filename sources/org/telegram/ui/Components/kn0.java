package org.telegram.ui.Components;

import android.view.View;
public final class kn0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        qn0 qn0Var;
        pn0 pn0Var;
        View view = c1Var.f41610a;
        if ((view instanceof qn0) && (pn0Var = (qn0Var = (qn0) view).f26450a) != null) {
            pn0Var.f47079i = pn0Var.N;
            pn0Var.f47077g = pn0Var.O;
            pn0Var.h = pn0Var.P;
            qn0Var.f26451b.d(0.0f, true);
            qn0Var.invalidate();
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
        this.f41670r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
