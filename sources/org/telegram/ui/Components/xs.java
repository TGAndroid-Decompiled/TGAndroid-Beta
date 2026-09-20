package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class xs extends AnimatorListenerAdapter {
    public final int f30355a;
    public final s4.c1 f30356b;
    public final int f30357c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f30358f;
    public final s4.f1 h;

    public xs(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f30355a = i12;
        this.h = f1Var;
        this.f30356b = c1Var;
        this.f30357c = i10;
        this.d = view;
        this.e = i11;
        this.f30358f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30355a) {
            case 0:
                int i10 = this.f30357c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f30356b.f42974a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f9848a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f30357c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30355a) {
            case 0:
                this.f30358f.setListener(null);
                at atVar = (at) this.h;
                s4.c1 c1Var = this.f30356b;
                atVar.v(c1Var);
                atVar.f22762w.remove(c1Var);
                atVar.A();
                View view = c1Var.f42974a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f9848a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f30358f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f30356b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f43041z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30355a) {
            case 0:
                ((at) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
