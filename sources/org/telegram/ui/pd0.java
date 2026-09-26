package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f36502a;
    public final qg0 f36503b;

    public pd0(qg0 qg0Var, int i10) {
        this.f36502a = i10;
        this.f36503b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36502a) {
            case 0:
                qg0 qg0Var = this.f36503b;
                if (qg0Var.d == animator) {
                    qg0Var.d = null;
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f36503b;
                qg0Var2.f36889c.setVisibility(8);
                if (qg0Var2.d == animator) {
                    qg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36502a) {
            case 0:
                this.f36503b.f36889c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
