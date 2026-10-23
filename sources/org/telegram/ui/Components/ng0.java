package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ng0 extends AnimatorListenerAdapter {
    public final int f28944a;
    public final og0 f28945b;

    public ng0(og0 og0Var, int i10) {
        this.f28944a = i10;
        this.f28945b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28944a) {
            case 0:
                this.f28945b.f29171a.f29554n.setVisibility(8);
                return;
            default:
                this.f28945b.f29171a.h.setVisibility(8);
                return;
        }
    }
}
