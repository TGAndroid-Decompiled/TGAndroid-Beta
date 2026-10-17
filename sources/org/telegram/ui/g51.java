package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g51 extends AnimatorListenerAdapter {
    public final int f37135a;
    public final i51 f37136b;

    public g51(i51 i51Var, int i10) {
        this.f37135a = i10;
        this.f37136b = i51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37135a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37136b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f37136b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                i51 i51Var = this.f37136b;
                i51Var.N = 0.0f;
                i51Var.I = null;
                i51Var.M = false;
                i51Var.d(true, false);
                return;
        }
    }
}
