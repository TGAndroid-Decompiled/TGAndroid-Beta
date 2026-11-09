package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f39751a;
    public final a3 f39752b;

    public y2(a3 a3Var, int i7) {
        this.f39751a = i7;
        this.f39752b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39751a) {
            case 0:
                a3 a3Var = this.f39752b;
                a3Var.f39192r = 0;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f39752b;
                a3Var2.f39193s = 0;
                a3Var2.invalidate();
                return;
        }
    }
}
