package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ot extends AnimatorListenerAdapter {
    public final int f29515a = 1;
    public final s4.d1 f29516b;
    public final View f29517c;
    public final ViewPropertyAnimator d;
    public final st f29518e;

    public ot(st stVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29518e = stVar;
        this.f29516b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29517c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29515a) {
            case 1:
                this.f29517c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29515a) {
            case 0:
                this.d.setListener(null);
                this.f29517c.setAlpha(1.0f);
                st stVar = this.f29518e;
                s4.d1 d1Var = this.f29516b;
                stVar.d(d1Var);
                stVar.f30858x.remove(d1Var);
                stVar.A();
                return;
            default:
                this.d.setListener(null);
                st stVar2 = this.f29518e;
                s4.d1 d1Var2 = this.f29516b;
                stVar2.u(d1Var2);
                stVar2.v.remove(d1Var2);
                stVar2.A();
                View view = d1Var2.f47748a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29515a) {
            case 0:
                this.f29518e.y();
                return;
            default:
                this.f29518e.getClass();
                return;
        }
    }

    public ot(st stVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29518e = stVar;
        this.f29516b = d1Var;
        this.f29517c = view;
        this.d = viewPropertyAnimator;
    }
}
