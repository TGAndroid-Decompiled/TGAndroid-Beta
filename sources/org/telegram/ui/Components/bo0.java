package org.telegram.ui.Components;

import android.view.View;
public final class bo0 extends s4.k {
    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        ho0 ho0Var;
        go0 go0Var;
        View view = b1Var.f46342a;
        if ((view instanceof ho0) && (go0Var = (ho0Var = (ho0) view).f27088a) != null) {
            go0Var.f753i = go0Var.N;
            go0Var.f751g = go0Var.O;
            go0Var.h = go0Var.P;
            ho0Var.f27089b.d(0.0f, true);
            ho0Var.invalidate();
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
        this.f46408r.add(new s4.j(b1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}
