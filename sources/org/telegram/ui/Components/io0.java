package org.telegram.ui.Components;

import android.view.View;
public final class io0 extends s4.j {
    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        oo0 oo0Var;
        no0 no0Var;
        View view = d1Var.f47748a;
        if ((view instanceof oo0) && (no0Var = (oo0Var = (oo0) view).f29438a) != null) {
            no0Var.f54680i = no0Var.N;
            no0Var.f54678g = no0Var.O;
            no0Var.h = no0Var.P;
            oo0Var.f29439b.d(0.0f, true);
            oo0Var.invalidate();
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
        this.f47811r.add(new s4.i(d1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.d1 d1Var) {
        return true;
    }
}
