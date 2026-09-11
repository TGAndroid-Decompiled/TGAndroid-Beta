package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class vs extends AnimatorListenerAdapter {
    public final int f31971a = 1;
    public final s4.c1 f31972b;
    public final View f31973c;
    public final ViewPropertyAnimator d;
    public final zs f31974e;

    public vs(zs zsVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31974e = zsVar;
        this.f31972b = c1Var;
        this.d = viewPropertyAnimator;
        this.f31973c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31971a) {
            case 1:
                this.f31973c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31971a) {
            case 0:
                this.d.setListener(null);
                this.f31973c.setAlpha(1.0f);
                zs zsVar = this.f31974e;
                s4.c1 c1Var = this.f31972b;
                zsVar.d(c1Var);
                zsVar.f33224x.remove(c1Var);
                zsVar.A();
                return;
            default:
                this.d.setListener(null);
                zs zsVar2 = this.f31974e;
                s4.c1 c1Var2 = this.f31972b;
                zsVar2.u(c1Var2);
                zsVar2.v.remove(c1Var2);
                zsVar2.A();
                View view = c1Var2.f45738a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31971a) {
            case 0:
                this.f31974e.y();
                return;
            default:
                this.f31974e.getClass();
                return;
        }
    }

    public vs(zs zsVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31974e = zsVar;
        this.f31972b = c1Var;
        this.f31973c = view;
        this.d = viewPropertyAnimator;
    }
}
