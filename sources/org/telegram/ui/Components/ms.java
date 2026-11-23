package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ms extends AnimatorListenerAdapter {
    public final int f37531a = 1;
    public final v4.f1 f37532b;
    public final View f37533c;
    public final ViewPropertyAnimator d;
    public final qs f37534e;

    public ms(qs qsVar, v4.f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f37534e = qsVar;
        this.f37532b = f1Var;
        this.d = viewPropertyAnimator;
        this.f37533c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37531a) {
            case 1:
                this.f37533c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37531a) {
            case 0:
                this.d.setListener(null);
                this.f37533c.setAlpha(1.0f);
                qs qsVar = this.f37534e;
                v4.f1 f1Var = this.f37532b;
                qsVar.d(f1Var);
                qsVar.f38992x.remove(f1Var);
                qsVar.A();
                return;
            default:
                this.d.setListener(null);
                qs qsVar2 = this.f37534e;
                v4.f1 f1Var2 = this.f37532b;
                qsVar2.u(f1Var2);
                qsVar2.v.remove(f1Var2);
                qsVar2.A();
                View view = f1Var2.f59245a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f37531a) {
            case 0:
                this.f37534e.y();
                return;
            default:
                this.f37534e.getClass();
                return;
        }
    }

    public ms(qs qsVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f37534e = qsVar;
        this.f37532b = f1Var;
        this.f37533c = view;
        this.d = viewPropertyAnimator;
    }
}
