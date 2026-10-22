package org.telegram.ui.Components;

import android.view.View;
public final class zn0 extends s4.k {
    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        fo0 fo0Var;
        eo0 eo0Var;
        View view = b1Var.f45920a;
        if ((view instanceof fo0) && (eo0Var = (fo0Var = (fo0) view).f26328a) != null) {
            eo0Var.f752i = eo0Var.N;
            eo0Var.f750g = eo0Var.O;
            eo0Var.h = eo0Var.P;
            fo0Var.f26329b.d(0.0f, true);
            fo0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(b1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(b1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f45986r.add(new s4.j(b1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}
