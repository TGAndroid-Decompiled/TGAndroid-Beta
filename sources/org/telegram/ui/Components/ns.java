package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ns extends AnimatorListenerAdapter {
    public final int f37847a = 1;
    public final v4.f1 f37848b;
    public final View f37849c;
    public final ViewPropertyAnimator d;
    public final rs f37850e;

    public ns(rs rsVar, v4.f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f37850e = rsVar;
        this.f37848b = f1Var;
        this.d = viewPropertyAnimator;
        this.f37849c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37847a) {
            case 1:
                this.f37849c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37847a) {
            case 0:
                this.d.setListener(null);
                this.f37849c.setAlpha(1.0f);
                rs rsVar = this.f37850e;
                v4.f1 f1Var = this.f37848b;
                rsVar.d(f1Var);
                rsVar.f39289x.remove(f1Var);
                rsVar.A();
                return;
            default:
                this.d.setListener(null);
                rs rsVar2 = this.f37850e;
                v4.f1 f1Var2 = this.f37848b;
                rsVar2.u(f1Var2);
                rsVar2.v.remove(f1Var2);
                rsVar2.A();
                View view = f1Var2.f59122a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f37847a) {
            case 0:
                this.f37850e.y();
                return;
            default:
                this.f37850e.getClass();
                return;
        }
    }

    public ns(rs rsVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f37850e = rsVar;
        this.f37848b = f1Var;
        this.f37849c = view;
        this.d = viewPropertyAnimator;
    }
}
