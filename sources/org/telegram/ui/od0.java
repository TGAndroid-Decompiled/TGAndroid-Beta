package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od0 extends AnimatorListenerAdapter {
    public final int f39660a;
    public final og0 f39661b;

    public od0(og0 og0Var, int i10) {
        this.f39660a = i10;
        this.f39661b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39660a) {
            case 0:
                og0 og0Var = this.f39661b;
                if (og0Var.d == animator) {
                    og0Var.d = null;
                    return;
                }
                return;
            default:
                og0 og0Var2 = this.f39661b;
                og0Var2.f39714c.setVisibility(8);
                if (og0Var2.d == animator) {
                    og0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39660a) {
            case 0:
                this.f39661b.f39714c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
