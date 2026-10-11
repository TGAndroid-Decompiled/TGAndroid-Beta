package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ot extends AnimatorListenerAdapter {
    public final int f29628a = 1;
    public final s4.d1 f29629b;
    public final View f29630c;
    public final ViewPropertyAnimator d;
    public final st f29631e;

    public ot(st stVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29631e = stVar;
        this.f29629b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29630c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29628a) {
            case 1:
                this.f29630c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29628a) {
            case 0:
                this.d.setListener(null);
                this.f29630c.setAlpha(1.0f);
                st stVar = this.f29631e;
                s4.d1 d1Var = this.f29629b;
                stVar.d(d1Var);
                stVar.f30940x.remove(d1Var);
                stVar.A();
                return;
            default:
                this.d.setListener(null);
                st stVar2 = this.f29631e;
                s4.d1 d1Var2 = this.f29629b;
                stVar2.u(d1Var2);
                stVar2.v.remove(d1Var2);
                stVar2.A();
                View view = d1Var2.f47782a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29628a) {
            case 0:
                this.f29631e.y();
                return;
            default:
                this.f29631e.getClass();
                return;
        }
    }

    public ot(st stVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29631e = stVar;
        this.f29629b = d1Var;
        this.f29630c = view;
        this.d = viewPropertyAnimator;
    }
}
