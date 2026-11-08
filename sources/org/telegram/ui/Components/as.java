package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class as extends AnimatorListenerAdapter {
    public final int f31898a = 1;
    public final v4.d1 f31899b;
    public final View f31900c;
    public final ViewPropertyAnimator d;
    public final es f31901e;

    public as(es esVar, v4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31901e = esVar;
        this.f31899b = d1Var;
        this.d = viewPropertyAnimator;
        this.f31900c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31898a) {
            case 1:
                this.f31900c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31898a) {
            case 0:
                this.d.setListener(null);
                this.f31900c.setAlpha(1.0f);
                es esVar = this.f31901e;
                v4.d1 d1Var = this.f31899b;
                esVar.d(d1Var);
                esVar.f33374x.remove(d1Var);
                esVar.A();
                return;
            default:
                this.d.setListener(null);
                es esVar2 = this.f31901e;
                v4.d1 d1Var2 = this.f31899b;
                esVar2.u(d1Var2);
                esVar2.v.remove(d1Var2);
                esVar2.A();
                View view = d1Var2.f57044a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31898a) {
            case 0:
                this.f31901e.y();
                return;
            default:
                this.f31901e.getClass();
                return;
        }
    }

    public as(es esVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31901e = esVar;
        this.f31899b = d1Var;
        this.f31900c = view;
        this.d = viewPropertyAnimator;
    }
}
