package org.telegram.ui.Components;

import android.view.View;
public final class on0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        un0 un0Var;
        tn0 tn0Var;
        View view = c1Var.f42959a;
        if ((view instanceof un0) && (tn0Var = (un0Var = (un0) view).f28859a) != null) {
            tn0Var.f49373i = tn0Var.N;
            tn0Var.f49371g = tn0Var.O;
            tn0Var.h = tn0Var.P;
            un0Var.f28860b.d(0.0f, true);
            un0Var.invalidate();
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
        this.f43019r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
