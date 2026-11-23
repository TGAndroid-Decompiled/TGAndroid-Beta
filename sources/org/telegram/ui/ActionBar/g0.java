package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f29027a;
    public final q0 f29028b;

    public g0(q0 q0Var, int i7) {
        this.f29027a = i7;
        this.f29028b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29027a) {
            case 0:
                q0 q0Var = this.f29028b;
                q0Var.f29981s.setVisibility(4);
                q0Var.f29986w = null;
                return;
            default:
                this.f29028b.f29986w = null;
                return;
        }
    }
}
