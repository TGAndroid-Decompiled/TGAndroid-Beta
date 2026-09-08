package org.telegram.ui.Components;

import android.view.View;
public final class an0 extends s4.j {
    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        gn0 gn0Var;
        fn0 fn0Var;
        View view = c1Var.f45766a;
        if ((view instanceof gn0) && (fn0Var = (gn0Var = (gn0) view).f26488a) != null) {
            fn0Var.f577i = fn0Var.N;
            fn0Var.f575g = fn0Var.O;
            fn0Var.h = fn0Var.P;
            gn0Var.f26489b.d(0.0f, true);
            gn0Var.invalidate();
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
        this.f45834r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
