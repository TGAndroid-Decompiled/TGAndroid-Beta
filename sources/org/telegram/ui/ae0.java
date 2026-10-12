package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ae0 extends AnimatorListenerAdapter {
    public final int f34191a;
    public final bh0 f34192b;

    public ae0(bh0 bh0Var, int i10) {
        this.f34191a = i10;
        this.f34192b = bh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34191a) {
            case 0:
                bh0 bh0Var = this.f34192b;
                if (bh0Var.d == animator) {
                    bh0Var.d = null;
                    return;
                }
                return;
            default:
                bh0 bh0Var2 = this.f34192b;
                bh0Var2.f34547c.setVisibility(8);
                if (bh0Var2.d == animator) {
                    bh0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34191a) {
            case 0:
                this.f34192b.f34547c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
