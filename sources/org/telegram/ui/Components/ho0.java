package org.telegram.ui.Components;

import android.view.View;
public final class ho0 extends s4.j {
    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        no0 no0Var;
        mo0 mo0Var;
        View view = d1Var.f47782a;
        if ((view instanceof no0) && (mo0Var = (no0Var = (no0) view).f29199a) != null) {
            mo0Var.f54714i = mo0Var.N;
            mo0Var.f54712g = mo0Var.O;
            mo0Var.h = mo0Var.P;
            no0Var.f29200b.d(0.0f, true);
            no0Var.invalidate();
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
        this.f47845r.add(new s4.i(d1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.d1 d1Var) {
        return true;
    }
}
