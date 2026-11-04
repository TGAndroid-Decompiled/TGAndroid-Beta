package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class as extends AnimatorListenerAdapter {
    public final int f31983a = 1;
    public final u4.d1 f31984b;
    public final View f31985c;
    public final ViewPropertyAnimator d;
    public final es f31986e;

    public as(es esVar, u4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31986e = esVar;
        this.f31984b = d1Var;
        this.d = viewPropertyAnimator;
        this.f31985c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31983a) {
            case 1:
                this.f31985c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31983a) {
            case 0:
                this.d.setListener(null);
                this.f31985c.setAlpha(1.0f);
                es esVar = this.f31986e;
                u4.d1 d1Var = this.f31984b;
                esVar.d(d1Var);
                esVar.f33461x.remove(d1Var);
                esVar.A();
                return;
            default:
                this.d.setListener(null);
                es esVar2 = this.f31986e;
                u4.d1 d1Var2 = this.f31984b;
                esVar2.u(d1Var2);
                esVar2.v.remove(d1Var2);
                esVar2.A();
                View view = d1Var2.f55540a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31983a) {
            case 0:
                this.f31986e.y();
                return;
            default:
                this.f31986e.getClass();
                return;
        }
    }

    public as(es esVar, u4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31986e = esVar;
        this.f31984b = d1Var;
        this.f31985c = view;
        this.d = viewPropertyAnimator;
    }
}
