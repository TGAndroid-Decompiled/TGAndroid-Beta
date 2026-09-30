package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class zs extends AnimatorListenerAdapter {
    public final int f31054a = 1;
    public final s4.c1 f31055b;
    public final View f31056c;
    public final ViewPropertyAnimator d;
    public final dt e;

    public zs(dt dtVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = dtVar;
        this.f31055b = c1Var;
        this.d = viewPropertyAnimator;
        this.f31056c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31054a) {
            case 1:
                this.f31056c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31054a) {
            case 0:
                this.d.setListener(null);
                this.f31056c.setAlpha(1.0f);
                dt dtVar = this.e;
                s4.c1 c1Var = this.f31055b;
                dtVar.d(c1Var);
                dtVar.f23725x.remove(c1Var);
                dtVar.A();
                return;
            default:
                this.d.setListener(null);
                dt dtVar2 = this.e;
                s4.c1 c1Var2 = this.f31055b;
                dtVar2.u(c1Var2);
                dtVar2.v.remove(c1Var2);
                dtVar2.A();
                View view = c1Var2.f43068a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31054a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public zs(dt dtVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = dtVar;
        this.f31055b = c1Var;
        this.f31056c = view;
        this.d = viewPropertyAnimator;
    }
}
