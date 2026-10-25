package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ld1 extends AnimatorListenerAdapter {
    public final int f41249a;
    public final pd1 f41250b;

    public ld1(pd1 pd1Var, int i10) {
        this.f41249a = i10;
        this.f41250b = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41249a) {
            case 0:
                pd1 pd1Var = this.f41250b;
                pd1Var.v = 0;
                pd1Var.f42472n.setVisibility(8);
                return;
            case 1:
                this.f41250b.v = 0;
                return;
            default:
                this.f41250b.F.setVisibility(8);
                return;
        }
    }
}
