package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f37793a;
    public final fg0 f37794b;

    public ed0(fg0 fg0Var, int i10) {
        this.f37793a = i10;
        this.f37794b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37793a) {
            case 0:
                fg0 fg0Var = this.f37794b;
                if (fg0Var.d == animator) {
                    fg0Var.d = null;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f37794b;
                fg0Var2.f38155c.setVisibility(8);
                if (fg0Var2.d == animator) {
                    fg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37793a) {
            case 0:
                this.f37794b.f38155c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
