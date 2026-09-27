package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ys extends AnimatorListenerAdapter {
    public final int f30770a = 1;
    public final s4.c1 f30771b;
    public final View f30772c;
    public final ViewPropertyAnimator d;
    public final ct e;

    public ys(ct ctVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ctVar;
        this.f30771b = c1Var;
        this.d = viewPropertyAnimator;
        this.f30772c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30770a) {
            case 1:
                this.f30772c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30770a) {
            case 0:
                this.d.setListener(null);
                this.f30772c.setAlpha(1.0f);
                ct ctVar = this.e;
                s4.c1 c1Var = this.f30771b;
                ctVar.d(c1Var);
                ctVar.f23404x.remove(c1Var);
                ctVar.A();
                return;
            default:
                this.d.setListener(null);
                ct ctVar2 = this.e;
                s4.c1 c1Var2 = this.f30771b;
                ctVar2.u(c1Var2);
                ctVar2.v.remove(c1Var2);
                ctVar2.A();
                View view = c1Var2.f43005a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30770a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ys(ct ctVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ctVar;
        this.f30771b = c1Var;
        this.f30772c = view;
        this.d = viewPropertyAnimator;
    }
}
