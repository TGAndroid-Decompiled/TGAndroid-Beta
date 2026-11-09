package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eb0 extends AnimatorListenerAdapter {
    public final int f45352a;
    public final ee0 f45353b;

    public eb0(ee0 ee0Var, int i7) {
        this.f45352a = i7;
        this.f45353b = ee0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45352a) {
            case 0:
                ee0 ee0Var = this.f45353b;
                if (ee0Var.d == animator) {
                    ee0Var.d = null;
                    return;
                }
                return;
            default:
                ee0 ee0Var2 = this.f45353b;
                ee0Var2.f45372c.setVisibility(8);
                if (ee0Var2.d == animator) {
                    ee0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45352a) {
            case 0:
                this.f45353b.f45372c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
