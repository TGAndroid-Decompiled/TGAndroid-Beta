package org.telegram.ui.Components;

import android.view.View;

public final class nm0 extends f2.l {
    @Override
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        tm0 tm0Var;
        sm0 sm0Var;
        View view = o1Var.f5789a;
        if ((view instanceof tm0) && (sm0Var = (tm0Var = (tm0) view).f32835a) != null) {
            sm0Var.f11390i = sm0Var.N;
            sm0Var.f11388g = sm0Var.O;
            sm0Var.h = sm0Var.P;
            tm0Var.f32836b.d(0.0f, true);
            tm0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(o1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5740r.add(new f2.k(o1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(f2.o1 o1Var) {
        return true;
    }
}
