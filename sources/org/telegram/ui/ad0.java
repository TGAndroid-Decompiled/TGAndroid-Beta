package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ad0 extends AnimatorListenerAdapter {
    public final int f35349a;
    public final dg0 f35350b;

    public ad0(dg0 dg0Var, int i10) {
        this.f35349a = i10;
        this.f35350b = dg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35349a) {
            case 0:
                dg0 dg0Var = this.f35350b;
                if (dg0Var.d == animator) {
                    dg0Var.d = null;
                    return;
                }
                return;
            default:
                dg0 dg0Var2 = this.f35350b;
                dg0Var2.f36371c.setVisibility(8);
                if (dg0Var2.d == animator) {
                    dg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35349a) {
            case 0:
                this.f35350b.f36371c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
