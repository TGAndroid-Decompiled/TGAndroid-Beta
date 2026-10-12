package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class kt extends AnimatorListenerAdapter {
    public final int f26798a = 1;
    public final s4.b1 f26799b;
    public final View f26800c;
    public final ViewPropertyAnimator d;
    public final ot e;

    public kt(ot otVar, s4.b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = otVar;
        this.f26799b = b1Var;
        this.d = viewPropertyAnimator;
        this.f26800c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26798a) {
            case 1:
                this.f26800c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26798a) {
            case 0:
                this.d.setListener(null);
                this.f26800c.setAlpha(1.0f);
                ot otVar = this.e;
                s4.b1 b1Var = this.f26799b;
                otVar.d(b1Var);
                otVar.f28053x.remove(b1Var);
                otVar.A();
                return;
            default:
                this.d.setListener(null);
                ot otVar2 = this.e;
                s4.b1 b1Var2 = this.f26799b;
                otVar2.u(b1Var2);
                otVar2.v.remove(b1Var2);
                otVar2.A();
                View view = b1Var2.f44838a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26798a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public kt(ot otVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = otVar;
        this.f26799b = b1Var;
        this.f26800c = view;
        this.d = viewPropertyAnimator;
    }
}
