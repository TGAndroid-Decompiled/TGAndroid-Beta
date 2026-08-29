package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class qs extends AnimatorListenerAdapter {
    public final int f32037a = 1;
    public final f2.n1 f32038b;
    public final View f32039c;
    public final ViewPropertyAnimator d;
    public final us f32040e;

    public qs(us usVar, f2.n1 n1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f32040e = usVar;
        this.f32038b = n1Var;
        this.d = viewPropertyAnimator;
        this.f32039c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32037a) {
            case 1:
                this.f32039c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32037a) {
            case 0:
                this.d.setListener(null);
                this.f32039c.setAlpha(1.0f);
                us usVar = this.f32040e;
                f2.n1 n1Var = this.f32038b;
                usVar.d(n1Var);
                usVar.f33312x.remove(n1Var);
                usVar.A();
                return;
            default:
                this.d.setListener(null);
                us usVar2 = this.f32040e;
                f2.n1 n1Var2 = this.f32038b;
                usVar2.u(n1Var2);
                usVar2.v.remove(n1Var2);
                usVar2.A();
                View view = n1Var2.f6432a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32037a) {
            case 0:
                this.f32040e.y();
                return;
            default:
                this.f32040e.getClass();
                return;
        }
    }

    public qs(us usVar, f2.n1 n1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32040e = usVar;
        this.f32038b = n1Var;
        this.f32039c = view;
        this.d = viewPropertyAnimator;
    }
}
