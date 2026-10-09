package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f40191a;
    public final oe1 f40192b;

    public ne1(oe1 oe1Var, int i10) {
        this.f40191a = i10;
        this.f40192b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40191a) {
            case 0:
                this.f40192b.h.f42417s.setVisibility(8);
                return;
            default:
                this.f40192b.h.f42410a.setVisibility(8);
                return;
        }
    }
}
