package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ft extends AnimatorListenerAdapter {
    public final int f26411a = 1;
    public final s4.b1 f26412b;
    public final View f26413c;
    public final ViewPropertyAnimator d;
    public final kt e;

    public ft(kt ktVar, s4.b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ktVar;
        this.f26412b = b1Var;
        this.d = viewPropertyAnimator;
        this.f26413c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26411a) {
            case 1:
                this.f26413c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26411a) {
            case 0:
                this.d.setListener(null);
                this.f26413c.setAlpha(1.0f);
                kt ktVar = this.e;
                s4.b1 b1Var = this.f26412b;
                ktVar.d(b1Var);
                ktVar.f27948x.remove(b1Var);
                ktVar.A();
                return;
            default:
                this.d.setListener(null);
                kt ktVar2 = this.e;
                s4.b1 b1Var2 = this.f26412b;
                ktVar2.u(b1Var2);
                ktVar2.v.remove(b1Var2);
                ktVar2.A();
                View view = b1Var2.f45920a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26411a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ft(kt ktVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ktVar;
        this.f26412b = b1Var;
        this.f26413c = view;
        this.d = viewPropertyAnimator;
    }
}
