package org.telegram.ui.Components;

import android.view.View;
public final class ml0 extends u4.k {
    @Override
    public final boolean r(u4.d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        sl0 sl0Var;
        rl0 rl0Var;
        View view = d1Var.f55540a;
        if ((view instanceof sl0) && (rl0Var = (sl0Var = (sl0) view).f38056a) != null) {
            rl0Var.h = rl0Var.M;
            rl0Var.f9069f = rl0Var.N;
            rl0Var.f9071g = rl0Var.O;
            sl0Var.f38057b.e(true, 0.0f);
            sl0Var.invalidate();
        }
        int translationX = i3 + ((int) view.getTranslationX());
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
        this.f55600r.add(new u4.j(d1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override
    public final boolean t(u4.d1 d1Var) {
        return true;
    }
}
