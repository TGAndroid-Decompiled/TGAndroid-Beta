package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class us extends AnimatorListenerAdapter {
    public final int f29276a = 1;
    public final f2.l1 f29277b;
    public final View f29278c;
    public final ViewPropertyAnimator d;
    public final ys e;

    public us(ys ysVar, f2.l1 l1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ysVar;
        this.f29277b = l1Var;
        this.d = viewPropertyAnimator;
        this.f29278c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29276a) {
            case 1:
                this.f29278c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29276a) {
            case 0:
                this.d.setListener(null);
                this.f29278c.setAlpha(1.0f);
                ys ysVar = this.e;
                f2.l1 l1Var = this.f29277b;
                ysVar.d(l1Var);
                ysVar.f31093x.remove(l1Var);
                ysVar.A();
                return;
            default:
                this.d.setListener(null);
                ys ysVar2 = this.e;
                f2.l1 l1Var2 = this.f29277b;
                ysVar2.u(l1Var2);
                ysVar2.v.remove(l1Var2);
                ysVar2.A();
                View view = l1Var2.f5785a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29276a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public us(ys ysVar, f2.l1 l1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ysVar;
        this.f29277b = l1Var;
        this.f29278c = view;
        this.d = viewPropertyAnimator;
    }
}
