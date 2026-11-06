package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27473a;
    public final r0 f27474b;

    public g0(r0 r0Var, int i7) {
        this.f27473a = i7;
        this.f27474b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27473a) {
            case 0:
                r0 r0Var = this.f27474b;
                r0Var.f28443s.setVisibility(4);
                r0Var.f28448w = null;
                return;
            default:
                this.f27474b.f28448w = null;
                return;
        }
    }
}
