package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class yy extends v4.k {
    public final ez F;

    public yy(ez ezVar) {
        this.F = ezVar;
    }

    @Override
    public final void C(v4.d1 d1Var, v4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.f56952a;
        if (view instanceof cz) {
            cz czVar = (cz) view;
            if (czVar.f32723x) {
                ValueAnimator valueAnimator = czVar.f32702a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    czVar.f32702a.removeAllUpdateListeners();
                    czVar.f32702a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xy(czVar, 0));
                ofFloat.addListener(new z5(czVar, 26));
                czVar.f32702a = ofFloat;
                ofFloat.setDuration(this.f57025e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f56952a;
        view.setTranslationX(0.0f);
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57009p.isEmpty();
        boolean isEmpty2 = this.f57011r.isEmpty();
        boolean isEmpty3 = this.f57012s.isEmpty();
        boolean isEmpty4 = this.f57010q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new e6(this, 23));
            ofFloat.setDuration(this.f57025e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(v4.d1 r34, e2.r0 r35, int r36, int r37, int r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yy.r(v4.d1, e2.r0, int, int, int, int):boolean");
    }

    @Override
    public final void x(v4.d1 d1Var) {
        d1Var.f56952a.setTranslationX(0.0f);
        View view = d1Var.f56952a;
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }
}
