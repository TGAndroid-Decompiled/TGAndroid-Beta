package org.telegram.ui.Components;

import android.view.View;
public final class nl0 extends v4.k {
    @Override
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        tl0 tl0Var;
        sl0 sl0Var;
        View view = e1Var.f58535a;
        if ((view instanceof tl0) && (sl0Var = (tl0Var = (tl0) view).f39712a) != null) {
            sl0Var.h = sl0Var.M;
            sl0Var.f5151f = sl0Var.N;
            sl0Var.f5153g = sl0Var.O;
            tl0Var.f39713b.e(true, 0.0f);
            tl0Var.invalidate();
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(e1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(e1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f58589r.add(new v4.j(e1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override
    public final boolean t(v4.e1 e1Var) {
        return true;
    }
}
