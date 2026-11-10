package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vh0 extends AnimatorListenerAdapter {
    public final int f39008a;
    public final ii0 f39009b;

    public vh0(ii0 ii0Var, int i7) {
        this.f39008a = i7;
        this.f39009b = ii0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39008a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f39009b.L0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                ii0 ii0Var = this.f39009b;
                ii0Var.Q = null;
                ii0Var.f34663n0 = 0.0f;
                ii0Var.f34661l0 = null;
                ii0Var.invalidate();
                return;
        }
    }
}
