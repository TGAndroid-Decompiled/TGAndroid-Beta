package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27484a;
    public final r0 f27485b;

    public g0(r0 r0Var, int i7) {
        this.f27484a = i7;
        this.f27485b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27484a) {
            case 0:
                r0 r0Var = this.f27485b;
                r0Var.f28452s.setVisibility(4);
                r0Var.f28457w = null;
                return;
            default:
                this.f27485b.f28457w = null;
                return;
        }
    }
}
