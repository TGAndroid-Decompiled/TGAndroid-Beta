package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hd1 extends AnimatorListenerAdapter {
    public final int f37816a;
    public final ld1 f37817b;

    public hd1(ld1 ld1Var, int i10) {
        this.f37816a = i10;
        this.f37817b = ld1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37816a) {
            case 0:
                ld1 ld1Var = this.f37817b;
                ld1Var.v = 0;
                ld1Var.f39206n.setVisibility(8);
                return;
            case 1:
                this.f37817b.v = 0;
                return;
            default:
                this.f37817b.F.setVisibility(8);
                return;
        }
    }
}
