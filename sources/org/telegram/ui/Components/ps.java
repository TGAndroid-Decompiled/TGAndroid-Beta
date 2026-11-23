package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ps extends AnimatorListenerAdapter {
    public final int f38612a = 1;
    public final v4.e1 f38613b;
    public final View f38614c;
    public final ViewPropertyAnimator d;
    public final ts f38615e;

    public ps(ts tsVar, v4.e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f38615e = tsVar;
        this.f38613b = e1Var;
        this.d = viewPropertyAnimator;
        this.f38614c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38612a) {
            case 1:
                this.f38614c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38612a) {
            case 0:
                this.d.setListener(null);
                this.f38614c.setAlpha(1.0f);
                ts tsVar = this.f38615e;
                v4.e1 e1Var = this.f38613b;
                tsVar.d(e1Var);
                tsVar.f40009x.remove(e1Var);
                tsVar.A();
                return;
            default:
                this.d.setListener(null);
                ts tsVar2 = this.f38615e;
                v4.e1 e1Var2 = this.f38613b;
                tsVar2.u(e1Var2);
                tsVar2.v.remove(e1Var2);
                tsVar2.A();
                View view = e1Var2.f59111a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38612a) {
            case 0:
                this.f38615e.y();
                return;
            default:
                this.f38615e.getClass();
                return;
        }
    }

    public ps(ts tsVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f38615e = tsVar;
        this.f38613b = e1Var;
        this.f38614c = view;
        this.d = viewPropertyAnimator;
    }
}
