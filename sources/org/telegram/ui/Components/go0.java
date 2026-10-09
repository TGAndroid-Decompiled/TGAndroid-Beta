package org.telegram.ui.Components;

import android.view.View;
public final class go0 extends s4.j {
    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        mo0 mo0Var;
        lo0 lo0Var;
        View view = d1Var.f47658a;
        if ((view instanceof mo0) && (lo0Var = (mo0Var = (mo0) view).f28871a) != null) {
            lo0Var.f54593i = lo0Var.N;
            lo0Var.f54591g = lo0Var.O;
            lo0Var.h = lo0Var.P;
            mo0Var.f28872b.d(0.0f, true);
            mo0Var.invalidate();
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
        this.f47721r.add(new s4.i(d1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.d1 d1Var) {
        return true;
    }
}
