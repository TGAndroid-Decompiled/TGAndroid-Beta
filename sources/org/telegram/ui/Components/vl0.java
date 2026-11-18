package org.telegram.ui.Components;

import android.view.View;
public final class vl0 extends v4.k {
    @Override
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        bm0 bm0Var;
        am0 am0Var;
        View view = f1Var.f59123a;
        if ((view instanceof bm0) && (am0Var = (bm0Var = (bm0) view).f33716a) != null) {
            am0Var.h = am0Var.M;
            am0Var.f5436f = am0Var.N;
            am0Var.f5438g = am0Var.O;
            bm0Var.f33717b.e(true, 0.0f);
            bm0Var.invalidate();
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(f1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(f1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f59173r.add(new v4.j(f1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override
    public final boolean t(v4.f1 f1Var) {
        return true;
    }
}
