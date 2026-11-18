package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cb0 extends AnimatorListenerAdapter {
    public final int f46474a;
    public final de0 f46475b;

    public cb0(de0 de0Var, int i7) {
        this.f46474a = i7;
        this.f46475b = de0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46474a) {
            case 0:
                de0 de0Var = this.f46475b;
                if (de0Var.d == animator) {
                    de0Var.d = null;
                    return;
                }
                return;
            default:
                de0 de0Var2 = this.f46475b;
                de0Var2.f46937c.setVisibility(8);
                if (de0Var2.d == animator) {
                    de0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46474a) {
            case 0:
                this.f46475b.f46937c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
