package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f38843a;
    public final ig0 f38844b;

    public ed0(ig0 ig0Var, int i10) {
        this.f38843a = i10;
        this.f38844b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38843a) {
            case 0:
                ig0 ig0Var = this.f38844b;
                if (ig0Var.d == animator) {
                    ig0Var.d = null;
                    return;
                }
                return;
            default:
                ig0 ig0Var2 = this.f38844b;
                ig0Var2.f40144c.setVisibility(8);
                if (ig0Var2.d == animator) {
                    ig0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38843a) {
            case 0:
                this.f38844b.f40144c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
