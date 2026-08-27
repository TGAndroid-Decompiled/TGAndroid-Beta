package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class ks extends AnimatorListenerAdapter {

    public final int f30174a = 1;

    public final f2.o1 f30175b;

    public final View f30176c;
    public final ViewPropertyAnimator d;

    public final os f30177e;

    public ks(os osVar, f2.o1 o1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f30177e = osVar;
        this.f30175b = o1Var;
        this.d = viewPropertyAnimator;
        this.f30176c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30174a) {
            case 1:
                this.f30176c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30174a) {
            case 0:
                this.d.setListener(null);
                this.f30176c.setAlpha(1.0f);
                os osVar = this.f30177e;
                f2.o1 o1Var = this.f30175b;
                osVar.d(o1Var);
                osVar.f31404x.remove(o1Var);
                osVar.A();
                break;
            default:
                this.d.setListener(null);
                os osVar2 = this.f30177e;
                f2.o1 o1Var2 = this.f30175b;
                osVar2.u(o1Var2);
                osVar2.v.remove(o1Var2);
                osVar2.A();
                View view = o1Var2.f5789a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30174a) {
            case 0:
                this.f30177e.y();
                break;
            default:
                this.f30177e.getClass();
                break;
        }
    }

    public ks(os osVar, f2.o1 o1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f30177e = osVar;
        this.f30175b = o1Var;
        this.f30176c = view;
        this.d = viewPropertyAnimator;
    }
}
