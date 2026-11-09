package org.telegram.ui.Components;

import android.view.View;
public final class kl0 extends v4.k {
    @Override
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        ql0 ql0Var;
        pl0 pl0Var;
        View view = d1Var.f57056a;
        if ((view instanceof ql0) && (pl0Var = (ql0Var = (ql0) view).f37410a) != null) {
            pl0Var.h = pl0Var.M;
            pl0Var.f6316f = pl0Var.N;
            pl0Var.f6318g = pl0Var.O;
            ql0Var.f37411b.e(true, 0.0f);
            ql0Var.invalidate();
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(d1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(d1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f57115r.add(new v4.j(d1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override
    public final boolean t(v4.d1 d1Var) {
        return true;
    }
}
