package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ad0 extends AnimatorListenerAdapter {
    public final int f35340a;
    public final cg0 f35341b;

    public ad0(cg0 cg0Var, int i10) {
        this.f35340a = i10;
        this.f35341b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35340a) {
            case 0:
                cg0 cg0Var = this.f35341b;
                if (cg0Var.d == animator) {
                    cg0Var.d = null;
                    return;
                }
                return;
            default:
                cg0 cg0Var2 = this.f35341b;
                cg0Var2.f35968c.setVisibility(8);
                if (cg0Var2.d == animator) {
                    cg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35340a) {
            case 0:
                this.f35341b.f35968c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
