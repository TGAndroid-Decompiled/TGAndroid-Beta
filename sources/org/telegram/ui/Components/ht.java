package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ht extends AnimatorListenerAdapter {
    public final int f29051a = 1;
    public final s4.e1 f29052b;
    public final View f29053c;
    public final ViewPropertyAnimator d;
    public final mt e;

    public ht(mt mtVar, s4.e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = mtVar;
        this.f29052b = e1Var;
        this.d = viewPropertyAnimator;
        this.f29053c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29051a) {
            case 1:
                this.f29053c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29051a) {
            case 0:
                this.d.setListener(null);
                this.f29053c.setAlpha(1.0f);
                mt mtVar = this.e;
                s4.e1 e1Var = this.f29052b;
                mtVar.d(e1Var);
                mtVar.f30747x.remove(e1Var);
                mtVar.A();
                return;
            default:
                this.d.setListener(null);
                mt mtVar2 = this.e;
                s4.e1 e1Var2 = this.f29052b;
                mtVar2.u(e1Var2);
                mtVar2.v.remove(e1Var2);
                mtVar2.A();
                View view = e1Var2.f47735a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29051a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ht(mt mtVar, s4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = mtVar;
        this.f29052b = e1Var;
        this.f29053c = view;
        this.d = viewPropertyAnimator;
    }
}
