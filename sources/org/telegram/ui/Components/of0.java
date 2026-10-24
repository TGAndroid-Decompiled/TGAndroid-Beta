package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29264a;
    public final qf0 f29265b;

    public of0(qf0 qf0Var, int i10) {
        this.f29264a = i10;
        this.f29265b = qf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29264a) {
            case 0:
                this.f29265b.f29908s = null;
                return;
            default:
                this.f29265b.v = null;
                return;
        }
    }
}
