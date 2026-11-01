package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ls extends AnimatorListenerAdapter {
    public final int f28255a = 1;
    public final s4.c1 f28256b;
    public final View f28257c;
    public final ViewPropertyAnimator d;
    public final ps e;

    public ls(ps psVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = psVar;
        this.f28256b = c1Var;
        this.d = viewPropertyAnimator;
        this.f28257c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28255a) {
            case 1:
                this.f28257c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28255a) {
            case 0:
                this.d.setListener(null);
                this.f28257c.setAlpha(1.0f);
                ps psVar = this.e;
                s4.c1 c1Var = this.f28256b;
                psVar.d(c1Var);
                psVar.f29527x.remove(c1Var);
                psVar.A();
                return;
            default:
                this.d.setListener(null);
                ps psVar2 = this.e;
                s4.c1 c1Var2 = this.f28256b;
                psVar2.u(c1Var2);
                psVar2.v.remove(c1Var2);
                psVar2.A();
                View view = c1Var2.f47909a;
                if (view instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28255a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ls(ps psVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = psVar;
        this.f28256b = c1Var;
        this.f28257c = view;
        this.d = viewPropertyAnimator;
    }
}
