package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aa1 extends AnimatorListenerAdapter {
    public final int f35599a;
    public final ea1 f35600b;

    public aa1(ea1 ea1Var, int i10) {
        this.f35599a = i10;
        this.f35600b = ea1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35599a) {
            case 0:
                ea1 ea1Var = this.f35600b;
                ea1Var.f37006w = 0;
                ea1Var.f37003n.setVisibility(8);
                return;
            case 1:
                this.f35600b.f37006w = 0;
                return;
            default:
                this.f35600b.F.setVisibility(8);
                return;
        }
    }
}
