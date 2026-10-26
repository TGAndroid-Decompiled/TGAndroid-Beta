package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ld1 extends AnimatorListenerAdapter {
    public final int f41252a;
    public final pd1 f41253b;

    public ld1(pd1 pd1Var, int i10) {
        this.f41252a = i10;
        this.f41253b = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41252a) {
            case 0:
                pd1 pd1Var = this.f41253b;
                pd1Var.v = 0;
                pd1Var.f42475n.setVisibility(8);
                return;
            case 1:
                this.f41253b.v = 0;
                return;
            default:
                this.f41253b.F.setVisibility(8);
                return;
        }
    }
}
