package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class xs extends AnimatorListenerAdapter {
    public final int f30395a = 1;
    public final s4.c1 f30396b;
    public final View f30397c;
    public final ViewPropertyAnimator d;
    public final bt e;

    public xs(bt btVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = btVar;
        this.f30396b = c1Var;
        this.d = viewPropertyAnimator;
        this.f30397c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30395a) {
            case 1:
                this.f30397c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30395a) {
            case 0:
                this.d.setListener(null);
                this.f30397c.setAlpha(1.0f);
                bt btVar = this.e;
                s4.c1 c1Var = this.f30396b;
                btVar.d(c1Var);
                btVar.f23088x.remove(c1Var);
                btVar.A();
                return;
            default:
                this.d.setListener(null);
                bt btVar2 = this.e;
                s4.c1 c1Var2 = this.f30396b;
                btVar2.u(c1Var2);
                btVar2.v.remove(c1Var2);
                btVar2.A();
                View view = c1Var2.f42961a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30395a) {
            case 0:
                this.e.y();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public xs(bt btVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = btVar;
        this.f30396b = c1Var;
        this.f30397c = view;
        this.d = viewPropertyAnimator;
    }
}
