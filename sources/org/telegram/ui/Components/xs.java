package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class xs extends AnimatorListenerAdapter {
    public final int f30045a = 1;
    public final s4.c1 f30046b;
    public final View f30047c;
    public final ViewPropertyAnimator d;
    public final bt e;

    public xs(bt btVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = btVar;
        this.f30046b = c1Var;
        this.d = viewPropertyAnimator;
        this.f30047c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30045a) {
            case 1:
                this.f30047c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30045a) {
            case 0:
                this.d.setListener(null);
                this.f30047c.setAlpha(1.0f);
                bt btVar = this.e;
                s4.c1 c1Var = this.f30046b;
                btVar.d(c1Var);
                btVar.f22843x.remove(c1Var);
                btVar.A();
                return;
            default:
                this.d.setListener(null);
                bt btVar2 = this.e;
                s4.c1 c1Var2 = this.f30046b;
                btVar2.u(c1Var2);
                btVar2.v.remove(c1Var2);
                btVar2.A();
                View view = c1Var2.f42627a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30045a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public xs(bt btVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = btVar;
        this.f30046b = c1Var;
        this.f30047c = view;
        this.d = viewPropertyAnimator;
    }
}
