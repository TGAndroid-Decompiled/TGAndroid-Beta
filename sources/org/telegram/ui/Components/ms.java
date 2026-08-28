package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ms extends AnimatorListenerAdapter {
    public final int f30914a = 1;
    public final f2.q1 f30915b;
    public final View f30916c;
    public final ViewPropertyAnimator d;
    public final ps f30917e;

    public ms(ps psVar, f2.q1 q1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f30917e = psVar;
        this.f30915b = q1Var;
        this.d = viewPropertyAnimator;
        this.f30916c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30914a) {
            case 1:
                this.f30916c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30914a) {
            case 0:
                this.d.setListener(null);
                this.f30916c.setAlpha(1.0f);
                ps psVar = this.f30917e;
                f2.q1 q1Var = this.f30915b;
                psVar.d(q1Var);
                psVar.f31743x.remove(q1Var);
                psVar.A();
                return;
            default:
                this.d.setListener(null);
                ps psVar2 = this.f30917e;
                f2.q1 q1Var2 = this.f30915b;
                psVar2.u(q1Var2);
                psVar2.v.remove(q1Var2);
                psVar2.A();
                View view = q1Var2.f5501a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30914a) {
            case 0:
                this.f30917e.y();
                return;
            default:
                this.f30917e.getClass();
                return;
        }
    }

    public ms(ps psVar, f2.q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f30917e = psVar;
        this.f30915b = q1Var;
        this.f30916c = view;
        this.d = viewPropertyAnimator;
    }
}
