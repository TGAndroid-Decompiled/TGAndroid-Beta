package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fd0 extends AnimatorListenerAdapter {
    public final int f37305a;
    public final ig0 f37306b;

    public fd0(ig0 ig0Var, int i10) {
        this.f37305a = i10;
        this.f37306b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37305a) {
            case 0:
                ig0 ig0Var = this.f37306b;
                if (ig0Var.d == animator) {
                    ig0Var.d = null;
                    return;
                }
                return;
            default:
                ig0 ig0Var2 = this.f37306b;
                ig0Var2.f38196c.setVisibility(8);
                if (ig0Var2.d == animator) {
                    ig0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37305a) {
            case 0:
                this.f37306b.f38196c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
