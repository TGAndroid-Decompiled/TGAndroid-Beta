package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vh0 extends AnimatorListenerAdapter {
    public final int f38952a;
    public final ii0 f38953b;

    public vh0(ii0 ii0Var, int i7) {
        this.f38952a = i7;
        this.f38953b = ii0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38952a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38953b.L0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                ii0 ii0Var = this.f38953b;
                ii0Var.Q = null;
                ii0Var.f34634n0 = 0.0f;
                ii0Var.f34632l0 = null;
                ii0Var.invalidate();
                return;
        }
    }
}
