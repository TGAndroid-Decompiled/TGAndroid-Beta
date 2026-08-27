package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class hd1 extends AnimatorListenerAdapter {

    public final int f38786a;

    public final ld1 f38787b;

    public hd1(ld1 ld1Var, int i10) {
        this.f38786a = i10;
        this.f38787b = ld1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38786a) {
            case 0:
                ld1 ld1Var = this.f38787b;
                ld1Var.v = 0;
                ld1Var.f40060n.setVisibility(8);
                break;
            case 1:
                this.f38787b.v = 0;
                break;
            default:
                this.f38787b.B.setVisibility(8);
                break;
        }
    }
}
