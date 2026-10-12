package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class rt extends AnimatorListenerAdapter {
    public final int f30234a;
    public final s4.d1 f30235b;
    public final int f30236c;
    public final View d;
    public final int f30237e;
    public final ViewPropertyAnimator f30238f;
    public final s4.g1 h;

    public rt(s4.g1 g1Var, s4.d1 d1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f30234a = i12;
        this.h = g1Var;
        this.f30235b = d1Var;
        this.f30236c = i10;
        this.d = view;
        this.f30237e = i11;
        this.f30238f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30234a) {
            case 0:
                int i10 = this.f30236c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f30237e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f30235b.f47897a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f10709a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f30236c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f30237e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30234a) {
            case 0:
                this.f30238f.setListener(null);
                ut utVar = (ut) this.h;
                s4.d1 d1Var = this.f30235b;
                utVar.v(d1Var);
                utVar.f31258w.remove(d1Var);
                utVar.A();
                View view = d1Var.f47897a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f10709a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f30238f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.d1 d1Var2 = this.f30235b;
                jVar.P(d1Var2);
                jVar.v(d1Var2);
                jVar.f47967z.remove(d1Var2);
                jVar.G();
                jVar.z(d1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30234a) {
            case 0:
                ((ut) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
