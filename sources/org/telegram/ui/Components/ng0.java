package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ng0 extends AnimatorListenerAdapter {
    public final int f26762a;
    public final qg0 f26763b;

    public ng0(qg0 qg0Var, int i10) {
        this.f26762a = i10;
        this.f26763b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26762a) {
            case 0:
                this.f26763b.F = null;
                return;
            default:
                this.f26763b.u();
                return;
        }
    }
}
