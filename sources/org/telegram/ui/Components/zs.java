package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class zs extends AnimatorListenerAdapter {
    public final int f33641a = 1;
    public final s4.c1 f33642b;
    public final View f33643c;
    public final ViewPropertyAnimator d;
    public final dt f33644e;

    public zs(dt dtVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f33644e = dtVar;
        this.f33642b = c1Var;
        this.d = viewPropertyAnimator;
        this.f33643c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33641a) {
            case 1:
                this.f33643c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33641a) {
            case 0:
                this.d.setListener(null);
                this.f33643c.setAlpha(1.0f);
                dt dtVar = this.f33644e;
                s4.c1 c1Var = this.f33642b;
                dtVar.d(c1Var);
                dtVar.f25825x.remove(c1Var);
                dtVar.A();
                return;
            default:
                this.d.setListener(null);
                dt dtVar2 = this.f33644e;
                s4.c1 c1Var2 = this.f33642b;
                dtVar2.u(c1Var2);
                dtVar2.v.remove(c1Var2);
                dtVar2.A();
                View view = c1Var2.f46531a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f33641a) {
            case 0:
                this.f33644e.y();
                return;
            default:
                this.f33644e.getClass();
                return;
        }
    }

    public zs(dt dtVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f33644e = dtVar;
        this.f33642b = c1Var;
        this.f33643c = view;
        this.d = viewPropertyAnimator;
    }
}
