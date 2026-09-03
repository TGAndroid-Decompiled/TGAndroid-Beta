package org.telegram.ui.Components;

import android.view.View;
public final class hn0 extends f2.l {
    @Override
    public final boolean r(f2.m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        nn0 nn0Var;
        mn0 mn0Var;
        View view = m1Var.f5875a;
        if ((view instanceof nn0) && (mn0Var = (nn0Var = (nn0) view).f29539a) != null) {
            mn0Var.f16157i = mn0Var.N;
            mn0Var.f16155g = mn0Var.O;
            mn0Var.h = mn0Var.P;
            nn0Var.f29540b.d(0.0f, true);
            nn0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(m1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(m1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5855r.add(new f2.k(m1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(f2.m1 m1Var) {
        return true;
    }
}
