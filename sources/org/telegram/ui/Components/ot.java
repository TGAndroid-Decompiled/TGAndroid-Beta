package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ot extends AnimatorListenerAdapter {
    public final int f29596a = 1;
    public final s4.d1 f29597b;
    public final View f29598c;
    public final ViewPropertyAnimator d;
    public final st f29599e;

    public ot(st stVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29599e = stVar;
        this.f29597b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29598c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29596a) {
            case 1:
                this.f29598c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29596a) {
            case 0:
                this.d.setListener(null);
                this.f29598c.setAlpha(1.0f);
                st stVar = this.f29599e;
                s4.d1 d1Var = this.f29597b;
                stVar.d(d1Var);
                stVar.f30860x.remove(d1Var);
                stVar.A();
                return;
            default:
                this.d.setListener(null);
                st stVar2 = this.f29599e;
                s4.d1 d1Var2 = this.f29597b;
                stVar2.u(d1Var2);
                stVar2.v.remove(d1Var2);
                stVar2.A();
                View view = d1Var2.f47702a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29596a) {
            case 0:
                this.f29599e.y();
                return;
            default:
                this.f29599e.getClass();
                return;
        }
    }

    public ot(st stVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29599e = stVar;
        this.f29597b = d1Var;
        this.f29598c = view;
        this.d = viewPropertyAnimator;
    }
}
