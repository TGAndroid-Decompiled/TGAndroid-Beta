package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ki0 extends AnimatorListenerAdapter {
    public final int f36917a;
    public final xi0 f36918b;

    public ki0(xi0 xi0Var, int i7) {
        this.f36917a = i7;
        this.f36918b = xi0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36917a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36918b.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                xi0 xi0Var = this.f36918b;
                xi0Var.R = null;
                xi0Var.f42139o0 = 0.0f;
                xi0Var.m0 = null;
                xi0Var.invalidate();
                return;
        }
    }
}
