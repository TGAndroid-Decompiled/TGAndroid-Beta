package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class as extends AnimatorListenerAdapter {
    public final int f31881a = 1;
    public final v4.d1 f31882b;
    public final View f31883c;
    public final ViewPropertyAnimator d;
    public final es f31884e;

    public as(es esVar, v4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31884e = esVar;
        this.f31882b = d1Var;
        this.d = viewPropertyAnimator;
        this.f31883c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31881a) {
            case 1:
                this.f31883c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31881a) {
            case 0:
                this.d.setListener(null);
                this.f31883c.setAlpha(1.0f);
                es esVar = this.f31884e;
                v4.d1 d1Var = this.f31882b;
                esVar.d(d1Var);
                esVar.f33328x.remove(d1Var);
                esVar.A();
                return;
            default:
                this.d.setListener(null);
                es esVar2 = this.f31884e;
                v4.d1 d1Var2 = this.f31882b;
                esVar2.u(d1Var2);
                esVar2.v.remove(d1Var2);
                esVar2.A();
                View view = d1Var2.f56927a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31881a) {
            case 0:
                this.f31884e.y();
                return;
            default:
                this.f31884e.getClass();
                return;
        }
    }

    public as(es esVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31884e = esVar;
        this.f31882b = d1Var;
        this.f31883c = view;
        this.d = viewPropertyAnimator;
    }
}
