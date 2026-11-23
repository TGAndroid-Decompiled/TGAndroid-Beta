package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f28968a;
    public final q0 f28969b;

    public g0(q0 q0Var, int i7) {
        this.f28968a = i7;
        this.f28969b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28968a) {
            case 0:
                q0 q0Var = this.f28969b;
                q0Var.f29924s.setVisibility(4);
                q0Var.f29929w = null;
                return;
            default:
                this.f28969b.f29929w = null;
                return;
        }
    }
}
