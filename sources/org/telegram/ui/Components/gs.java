package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class gs extends AnimatorListenerAdapter {
    public final int f35047a = 1;
    public final v4.e1 f35048b;
    public final View f35049c;
    public final ViewPropertyAnimator d;
    public final ks f35050e;

    public gs(ks ksVar, v4.e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f35050e = ksVar;
        this.f35048b = e1Var;
        this.d = viewPropertyAnimator;
        this.f35049c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35047a) {
            case 1:
                this.f35049c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35047a) {
            case 0:
                this.d.setListener(null);
                this.f35049c.setAlpha(1.0f);
                ks ksVar = this.f35050e;
                v4.e1 e1Var = this.f35048b;
                ksVar.d(e1Var);
                ksVar.f36603x.remove(e1Var);
                ksVar.A();
                return;
            default:
                this.d.setListener(null);
                ks ksVar2 = this.f35050e;
                v4.e1 e1Var2 = this.f35048b;
                ksVar2.u(e1Var2);
                ksVar2.v.remove(e1Var2);
                ksVar2.A();
                View view = e1Var2.f58535a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f35047a) {
            case 0:
                this.f35050e.y();
                return;
            default:
                this.f35050e.getClass();
                return;
        }
    }

    public gs(ks ksVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f35050e = ksVar;
        this.f35048b = e1Var;
        this.f35049c = view;
        this.d = viewPropertyAnimator;
    }
}
