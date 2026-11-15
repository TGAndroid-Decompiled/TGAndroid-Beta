package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zh0 extends AnimatorListenerAdapter {
    public final int f42365a;
    public final mi0 f42366b;

    public zh0(mi0 mi0Var, int i7) {
        this.f42365a = i7;
        this.f42366b = mi0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42365a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f42366b.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                mi0 mi0Var = this.f42366b;
                mi0Var.R = null;
                mi0Var.f37286o0 = 0.0f;
                mi0Var.m0 = null;
                mi0Var.invalidate();
                return;
        }
    }
}
