package org.telegram.ui.Components;

import android.view.View;
public final class lm0 extends f2.n {
    @Override
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        rm0 rm0Var;
        qm0 qm0Var;
        View view = q1Var.f5501a;
        if ((view instanceof rm0) && (qm0Var = (rm0Var = (rm0) view).f32200a) != null) {
            qm0Var.f10694i = qm0Var.N;
            qm0Var.f10692g = qm0Var.O;
            qm0Var.h = qm0Var.P;
            rm0Var.f32201b.d(0.0f, true);
            rm0Var.invalidate();
        }
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(q1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(q1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f5452r.add(new f2.m(q1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override
    public final boolean t(f2.q1 q1Var) {
        return true;
    }
}
