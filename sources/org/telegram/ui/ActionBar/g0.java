package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27476a;
    public final r0 f27477b;

    public g0(r0 r0Var, int i7) {
        this.f27476a = i7;
        this.f27477b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27476a) {
            case 0:
                r0 r0Var = this.f27477b;
                r0Var.f28446s.setVisibility(4);
                r0Var.f28451w = null;
                return;
            default:
                this.f27477b.f28451w = null;
                return;
        }
    }
}
