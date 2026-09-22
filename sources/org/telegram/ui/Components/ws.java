package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ws extends AnimatorListenerAdapter {
    public final int f30133a = 1;
    public final s4.c1 f30134b;
    public final View f30135c;
    public final ViewPropertyAnimator d;
    public final at e;

    public ws(at atVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = atVar;
        this.f30134b = c1Var;
        this.d = viewPropertyAnimator;
        this.f30135c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30133a) {
            case 1:
                this.f30135c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30133a) {
            case 0:
                this.d.setListener(null);
                this.f30135c.setAlpha(1.0f);
                at atVar = this.e;
                s4.c1 c1Var = this.f30134b;
                atVar.d(c1Var);
                atVar.f22732x.remove(c1Var);
                atVar.A();
                return;
            default:
                this.d.setListener(null);
                at atVar2 = this.e;
                s4.c1 c1Var2 = this.f30134b;
                atVar2.u(c1Var2);
                atVar2.v.remove(c1Var2);
                atVar2.A();
                View view = c1Var2.f42995a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30133a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ws(at atVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = atVar;
        this.f30134b = c1Var;
        this.f30135c = view;
        this.d = viewPropertyAnimator;
    }
}
