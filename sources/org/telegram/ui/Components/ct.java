package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ct extends AnimatorListenerAdapter {
    public final int f22218a = 1;
    public final s4.c1 f22219b;
    public final View f22220c;
    public final ViewPropertyAnimator d;
    public final gt e;

    public ct(gt gtVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = gtVar;
        this.f22219b = c1Var;
        this.d = viewPropertyAnimator;
        this.f22220c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22218a) {
            case 1:
                this.f22220c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22218a) {
            case 0:
                this.d.setListener(null);
                this.f22220c.setAlpha(1.0f);
                gt gtVar = this.e;
                s4.c1 c1Var = this.f22219b;
                gtVar.d(c1Var);
                gtVar.f23429x.remove(c1Var);
                gtVar.A();
                return;
            default:
                this.d.setListener(null);
                gt gtVar2 = this.e;
                s4.c1 c1Var2 = this.f22219b;
                gtVar2.u(c1Var2);
                gtVar2.v.remove(c1Var2);
                gtVar2.A();
                View view = c1Var2.f41610a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22218a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ct(gt gtVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = gtVar;
        this.f22219b = c1Var;
        this.f22220c = view;
        this.d = viewPropertyAnimator;
    }
}
