package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f36607a;
    public final qg0 f36608b;

    public pd0(qg0 qg0Var, int i10) {
        this.f36607a = i10;
        this.f36608b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36607a) {
            case 0:
                qg0 qg0Var = this.f36608b;
                if (qg0Var.d == animator) {
                    qg0Var.d = null;
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f36608b;
                qg0Var2.f36989c.setVisibility(8);
                if (qg0Var2.d == animator) {
                    qg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36607a) {
            case 0:
                this.f36608b.f36989c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
