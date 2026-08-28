package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b81 extends AnimatorListenerAdapter {
    public final int f27072a;
    public final c81 f27073b;

    public b81(c81 c81Var, int i9) {
        this.f27072a = i9;
        this.f27073b = c81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27072a) {
            case 0:
                this.f27073b.f27424y = null;
                return;
            default:
                this.f27073b.f27424y = null;
                return;
        }
    }
}
