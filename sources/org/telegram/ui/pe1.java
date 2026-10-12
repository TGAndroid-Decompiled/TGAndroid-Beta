package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f40947a;
    public final qe1 f40948b;

    public pe1(qe1 qe1Var, int i10) {
        this.f40947a = i10;
        this.f40948b = qe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40947a) {
            case 0:
                this.f40948b.h.f43154s.setVisibility(8);
                return;
            default:
                this.f40948b.h.f43147a.setVisibility(8);
                return;
        }
    }
}
