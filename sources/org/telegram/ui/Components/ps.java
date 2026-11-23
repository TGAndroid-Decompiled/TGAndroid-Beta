package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ps extends AnimatorListenerAdapter {
    public final int f38657a = 1;
    public final v4.f1 f38658b;
    public final View f38659c;
    public final ViewPropertyAnimator d;
    public final ts f38660e;

    public ps(ts tsVar, v4.f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f38660e = tsVar;
        this.f38658b = f1Var;
        this.d = viewPropertyAnimator;
        this.f38659c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38657a) {
            case 1:
                this.f38659c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38657a) {
            case 0:
                this.d.setListener(null);
                this.f38659c.setAlpha(1.0f);
                ts tsVar = this.f38660e;
                v4.f1 f1Var = this.f38658b;
                tsVar.d(f1Var);
                tsVar.f40030x.remove(f1Var);
                tsVar.A();
                return;
            default:
                this.d.setListener(null);
                ts tsVar2 = this.f38660e;
                v4.f1 f1Var2 = this.f38658b;
                tsVar2.u(f1Var2);
                tsVar2.v.remove(f1Var2);
                tsVar2.A();
                View view = f1Var2.f59165a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38657a) {
            case 0:
                this.f38660e.y();
                return;
            default:
                this.f38660e.getClass();
                return;
        }
    }

    public ps(ts tsVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f38660e = tsVar;
        this.f38658b = f1Var;
        this.f38659c = view;
        this.d = viewPropertyAnimator;
    }
}
