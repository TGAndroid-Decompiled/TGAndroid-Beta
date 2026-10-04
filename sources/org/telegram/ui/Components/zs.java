package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class zs extends AnimatorListenerAdapter {
    public final int f33634a = 1;
    public final s4.c1 f33635b;
    public final View f33636c;
    public final ViewPropertyAnimator d;
    public final dt f33637e;

    public zs(dt dtVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f33637e = dtVar;
        this.f33635b = c1Var;
        this.d = viewPropertyAnimator;
        this.f33636c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33634a) {
            case 1:
                this.f33636c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33634a) {
            case 0:
                this.d.setListener(null);
                this.f33636c.setAlpha(1.0f);
                dt dtVar = this.f33637e;
                s4.c1 c1Var = this.f33635b;
                dtVar.d(c1Var);
                dtVar.f25819x.remove(c1Var);
                dtVar.A();
                return;
            default:
                this.d.setListener(null);
                dt dtVar2 = this.f33637e;
                s4.c1 c1Var2 = this.f33635b;
                dtVar2.u(c1Var2);
                dtVar2.v.remove(c1Var2);
                dtVar2.A();
                View view = c1Var2.f46523a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f33634a) {
            case 0:
                this.f33637e.y();
                return;
            default:
                this.f33637e.getClass();
                return;
        }
    }

    public zs(dt dtVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f33637e = dtVar;
        this.f33635b = c1Var;
        this.f33636c = view;
        this.d = viewPropertyAnimator;
    }
}
