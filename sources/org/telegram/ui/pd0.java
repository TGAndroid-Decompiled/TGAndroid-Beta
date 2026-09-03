package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f37104a;
    public final pg0 f37105b;

    public pd0(pg0 pg0Var, int i10) {
        this.f37104a = i10;
        this.f37105b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37104a) {
            case 0:
                pg0 pg0Var = this.f37105b;
                if (pg0Var.d == animator) {
                    pg0Var.d = null;
                    return;
                }
                return;
            default:
                pg0 pg0Var2 = this.f37105b;
                pg0Var2.f37130c.setVisibility(8);
                if (pg0Var2.d == animator) {
                    pg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37104a) {
            case 0:
                this.f37105b.f37130c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
