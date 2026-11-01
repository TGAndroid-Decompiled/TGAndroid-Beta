package org.telegram.ui.Components;

import android.view.View;
public final class lm0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        rm0 rm0Var;
        qm0 qm0Var;
        View view = c1Var.f47909a;
        if ((view instanceof rm0) && (qm0Var = (rm0Var = (rm0) view).f30018a) != null) {
            qm0Var.h = qm0Var.M;
            qm0Var.f48410f = qm0Var.N;
            qm0Var.f48412g = qm0Var.O;
            rm0Var.f30019b.e(true, 0.0f);
            rm0Var.invalidate();
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
        this.f47959r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
