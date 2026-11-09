package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wh0 extends AnimatorListenerAdapter {
    public final int f40057a;
    public final ji0 f40058b;

    public wh0(ji0 ji0Var, int i7) {
        this.f40057a = i7;
        this.f40058b = ji0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40057a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40058b.L0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                ji0 ji0Var = this.f40058b;
                ji0Var.Q = null;
                ji0Var.f35054n0 = 0.0f;
                ji0Var.f35052l0 = null;
                ji0Var.invalidate();
                return;
        }
    }
}
