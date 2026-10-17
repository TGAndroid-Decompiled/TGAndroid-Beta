package org.telegram.ui.Components;

import android.view.View;
public final class yn0 extends s4.k {
    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        eo0 eo0Var;
        do0 do0Var;
        View view = b1Var.f45938a;
        if ((view instanceof eo0) && (do0Var = (eo0Var = (eo0) view).f25963a) != null) {
            do0Var.f754i = do0Var.N;
            do0Var.f752g = do0Var.O;
            do0Var.h = do0Var.P;
            eo0Var.f25964b.d(0.0f, true);
            eo0Var.invalidate();
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
        this.f46004r.add(new s4.j(b1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}
