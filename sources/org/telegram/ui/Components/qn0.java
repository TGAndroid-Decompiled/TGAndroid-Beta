package org.telegram.ui.Components;

import android.view.View;
public final class qn0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        wn0 wn0Var;
        vn0 vn0Var;
        View view = c1Var.f43068a;
        if ((view instanceof wn0) && (vn0Var = (wn0Var = (wn0) view).f30011a) != null) {
            vn0Var.f49482i = vn0Var.N;
            vn0Var.f49480g = vn0Var.O;
            vn0Var.h = vn0Var.P;
            wn0Var.f30012b.d(0.0f, true);
            wn0Var.invalidate();
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
        this.f43128r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
