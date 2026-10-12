package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f40945a;
    public final qe1 f40946b;

    public pe1(qe1 qe1Var, int i10) {
        this.f40945a = i10;
        this.f40946b = qe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40945a) {
            case 0:
                this.f40946b.h.f43152s.setVisibility(8);
                return;
            default:
                this.f40946b.h.f43145a.setVisibility(8);
                return;
        }
    }
}
