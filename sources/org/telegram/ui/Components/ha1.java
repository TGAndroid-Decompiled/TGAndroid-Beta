package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ha1 extends AnimatorListenerAdapter {
    public final int f28900a;
    public final ia1 f28901b;

    public ha1(ia1 ia1Var, int i10) {
        this.f28900a = i10;
        this.f28901b = ia1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28900a) {
            case 0:
                this.f28901b.f29252y = null;
                return;
            default:
                this.f28901b.f29252y = null;
                return;
        }
    }
}
