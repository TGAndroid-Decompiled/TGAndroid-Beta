package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class db0 extends AnimatorListenerAdapter {
    public final int f46851a;
    public final ee0 f46852b;

    public db0(ee0 ee0Var, int i7) {
        this.f46851a = i7;
        this.f46852b = ee0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46851a) {
            case 0:
                ee0 ee0Var = this.f46852b;
                if (ee0Var.d == animator) {
                    ee0Var.d = null;
                    return;
                }
                return;
            default:
                ee0 ee0Var2 = this.f46852b;
                ee0Var2.f47181c.setVisibility(8);
                if (ee0Var2.d == animator) {
                    ee0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46851a) {
            case 0:
                this.f46852b.f47181c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
