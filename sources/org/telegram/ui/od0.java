package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od0 extends AnimatorListenerAdapter {
    public final int f39728a;
    public final og0 f39729b;

    public od0(og0 og0Var, int i10) {
        this.f39728a = i10;
        this.f39729b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39728a) {
            case 0:
                og0 og0Var = this.f39729b;
                if (og0Var.d == animator) {
                    og0Var.d = null;
                    return;
                }
                return;
            default:
                og0 og0Var2 = this.f39729b;
                og0Var2.f39754c.setVisibility(8);
                if (og0Var2.d == animator) {
                    og0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39728a) {
            case 0:
                this.f39729b.f39754c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
