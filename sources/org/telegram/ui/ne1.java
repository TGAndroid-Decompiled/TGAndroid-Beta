package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f40237a;
    public final oe1 f40238b;

    public ne1(oe1 oe1Var, int i10) {
        this.f40237a = i10;
        this.f40238b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40237a) {
            case 0:
                this.f40238b.h.f42463s.setVisibility(8);
                return;
            default:
                this.f40238b.h.f42456a.setVisibility(8);
                return;
        }
    }
}
