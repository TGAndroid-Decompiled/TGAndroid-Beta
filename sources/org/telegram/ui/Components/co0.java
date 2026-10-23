package org.telegram.ui.Components;

import android.view.View;
public final class co0 extends s4.k {
    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        io0 io0Var;
        ho0 ho0Var;
        View view = b1Var.f46343a;
        if ((view instanceof io0) && (ho0Var = (io0Var = (io0) view).f27376a) != null) {
            ho0Var.f753i = ho0Var.N;
            ho0Var.f751g = ho0Var.O;
            ho0Var.h = ho0Var.P;
            io0Var.f27377b.d(0.0f, true);
            io0Var.invalidate();
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
        this.f46409r.add(new s4.j(b1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}
