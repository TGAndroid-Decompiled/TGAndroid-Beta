package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class qt extends AnimatorListenerAdapter {
    public final int f29929a = 1;
    public final s4.d1 f29930b;
    public final View f29931c;
    public final ViewPropertyAnimator d;
    public final ut f29932e;

    public qt(ut utVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29932e = utVar;
        this.f29930b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29931c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29929a) {
            case 1:
                this.f29931c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29929a) {
            case 0:
                this.d.setListener(null);
                this.f29931c.setAlpha(1.0f);
                ut utVar = this.f29932e;
                s4.d1 d1Var = this.f29930b;
                utVar.d(d1Var);
                utVar.f31259x.remove(d1Var);
                utVar.A();
                return;
            default:
                this.d.setListener(null);
                ut utVar2 = this.f29932e;
                s4.d1 d1Var2 = this.f29930b;
                utVar2.u(d1Var2);
                utVar2.v.remove(d1Var2);
                utVar2.A();
                View view = d1Var2.f47897a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29929a) {
            case 0:
                this.f29932e.y();
                return;
            default:
                this.f29932e.getClass();
                return;
        }
    }

    public qt(ut utVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29932e = utVar;
        this.f29930b = d1Var;
        this.f29931c = view;
        this.d = viewPropertyAnimator;
    }
}
