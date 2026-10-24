package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class dt extends AnimatorListenerAdapter {
    public final int f25834a = 1;
    public final s4.b1 f25835b;
    public final View f25836c;
    public final ViewPropertyAnimator d;
    public final ht e;

    public dt(ht htVar, s4.b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = htVar;
        this.f25835b = b1Var;
        this.d = viewPropertyAnimator;
        this.f25836c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25834a) {
            case 1:
                this.f25836c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25834a) {
            case 0:
                this.d.setListener(null);
                this.f25836c.setAlpha(1.0f);
                ht htVar = this.e;
                s4.b1 b1Var = this.f25835b;
                htVar.d(b1Var);
                htVar.f27168x.remove(b1Var);
                htVar.A();
                return;
            default:
                this.d.setListener(null);
                ht htVar2 = this.e;
                s4.b1 b1Var2 = this.f25835b;
                htVar2.u(b1Var2);
                htVar2.v.remove(b1Var2);
                htVar2.A();
                View view = b1Var2.f46342a;
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f25834a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public dt(ht htVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = htVar;
        this.f25835b = b1Var;
        this.f25836c = view;
        this.d = viewPropertyAnimator;
    }
}
