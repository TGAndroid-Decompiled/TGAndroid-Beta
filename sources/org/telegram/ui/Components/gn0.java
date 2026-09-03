package org.telegram.ui.Components;

import android.view.View;
public final class gn0 extends f2.l {
    @Override
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        mn0 mn0Var;
        ln0 ln0Var;
        View view = l1Var.f5774a;
        if ((view instanceof mn0) && (ln0Var = (mn0Var = (mn0) view).f27098a) != null) {
            ln0Var.f14073i = ln0Var.N;
            ln0Var.f14071g = ln0Var.O;
            ln0Var.h = ln0Var.P;
            mn0Var.f27099b.d(0.0f, true);
            mn0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5765r.add(new f2.k(l1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override
    public final boolean t(f2.l1 l1Var) {
        return true;
    }
}
