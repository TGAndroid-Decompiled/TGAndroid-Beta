package org.telegram.ui.Components;

import android.view.View;
public final class bn0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        hn0 hn0Var;
        gn0 gn0Var;
        View view = c1Var.f42627a;
        if ((view instanceof hn0) && (gn0Var = (hn0Var = (hn0) view).f24753a) != null) {
            gn0Var.f49048i = gn0Var.N;
            gn0Var.f49046g = gn0Var.O;
            gn0Var.h = gn0Var.P;
            hn0Var.f24754b.d(0.0f, true);
            hn0Var.invalidate();
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
        this.f42687r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
