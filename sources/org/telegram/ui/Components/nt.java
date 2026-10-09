package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class nt extends AnimatorListenerAdapter {
    public final int f29278a = 1;
    public final s4.d1 f29279b;
    public final View f29280c;
    public final ViewPropertyAnimator d;
    public final rt f29281e;

    public nt(rt rtVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29281e = rtVar;
        this.f29279b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29280c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29278a) {
            case 1:
                this.f29280c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29278a) {
            case 0:
                this.d.setListener(null);
                this.f29280c.setAlpha(1.0f);
                rt rtVar = this.f29281e;
                s4.d1 d1Var = this.f29279b;
                rtVar.d(d1Var);
                rtVar.f30508x.remove(d1Var);
                rtVar.A();
                return;
            default:
                this.d.setListener(null);
                rt rtVar2 = this.f29281e;
                s4.d1 d1Var2 = this.f29279b;
                rtVar2.u(d1Var2);
                rtVar2.v.remove(d1Var2);
                rtVar2.A();
                View view = d1Var2.f47656a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29278a) {
            case 0:
                this.f29281e.y();
                return;
            default:
                this.f29281e.getClass();
                return;
        }
    }

    public nt(rt rtVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29281e = rtVar;
        this.f29279b = d1Var;
        this.f29280c = view;
        this.d = viewPropertyAnimator;
    }
}
