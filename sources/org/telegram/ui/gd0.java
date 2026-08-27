package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class gd0 extends AnimatorListenerAdapter {

    public final int f38390a;

    public final ig0 f38391b;

    public gd0(ig0 ig0Var, int i10) {
        this.f38390a = i10;
        this.f38391b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38390a) {
            case 0:
                ig0 ig0Var = this.f38391b;
                if (ig0Var.d == animator) {
                    ig0Var.d = null;
                }
                break;
            default:
                ig0 ig0Var2 = this.f38391b;
                ig0Var2.f39083c.setVisibility(8);
                if (ig0Var2.d == animator) {
                    ig0Var2.d = null;
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38390a) {
            case 0:
                this.f38391b.f39083c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
