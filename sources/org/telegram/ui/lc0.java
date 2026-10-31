package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lc0 extends AnimatorListenerAdapter {
    public final int f39171a;
    public final hf0 f39172b;

    public lc0(hf0 hf0Var, int i10) {
        this.f39171a = i10;
        this.f39172b = hf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39171a) {
            case 0:
                hf0 hf0Var = this.f39172b;
                if (hf0Var.d == animator) {
                    hf0Var.d = null;
                    return;
                }
                return;
            default:
                hf0 hf0Var2 = this.f39172b;
                hf0Var2.f37922c.setVisibility(8);
                if (hf0Var2.d == animator) {
                    hf0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39171a) {
            case 0:
                this.f39172b.f37922c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
