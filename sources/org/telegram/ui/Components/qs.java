package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class qs extends AnimatorListenerAdapter {
    public final int f38937a;
    public final v4.e1 f38938b;
    public final int f38939c;
    public final View d;
    public final int f38940e;
    public final ViewPropertyAnimator f38941f;
    public final v4.g1 h;

    public qs(v4.g1 g1Var, v4.e1 e1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f38937a = i11;
        this.h = g1Var;
        this.f38938b = e1Var;
        this.f38939c = i7;
        this.d = view;
        this.f38940e = i10;
        this.f38941f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38937a) {
            case 0:
                int i7 = this.f38939c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f38940e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f38938b.f59111a;
                if (view2 instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.l) {
                    ((jg.l) view2).f17555a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f38939c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f38940e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38937a) {
            case 0:
                this.f38941f.setListener(null);
                ts tsVar = (ts) this.h;
                v4.e1 e1Var = this.f38938b;
                tsVar.v(e1Var);
                tsVar.f40008w.remove(e1Var);
                tsVar.A();
                View view = e1Var.f59111a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).f17555a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f38941f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.e1 e1Var2 = this.f38938b;
                kVar.P(e1Var2);
                kVar.v(e1Var2);
                kVar.f59171z.remove(e1Var2);
                kVar.G();
                kVar.z(e1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38937a) {
            case 0:
                ((ts) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
