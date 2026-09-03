package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ts extends AnimatorListenerAdapter {
    public final int f29021a = 1;
    public final f2.l1 f29022b;
    public final View f29023c;
    public final ViewPropertyAnimator d;
    public final xs e;

    public ts(xs xsVar, f2.l1 l1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = xsVar;
        this.f29022b = l1Var;
        this.d = viewPropertyAnimator;
        this.f29023c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29021a) {
            case 1:
                this.f29023c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29021a) {
            case 0:
                this.d.setListener(null);
                this.f29023c.setAlpha(1.0f);
                xs xsVar = this.e;
                f2.l1 l1Var = this.f29022b;
                xsVar.d(l1Var);
                xsVar.f30707x.remove(l1Var);
                xsVar.A();
                return;
            default:
                this.d.setListener(null);
                xs xsVar2 = this.e;
                f2.l1 l1Var2 = this.f29022b;
                xsVar2.u(l1Var2);
                xsVar2.v.remove(l1Var2);
                xsVar2.A();
                View view = l1Var2.f5774a;
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29021a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ts(xs xsVar, f2.l1 l1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = xsVar;
        this.f29022b = l1Var;
        this.f29023c = view;
        this.d = viewPropertyAnimator;
    }
}
