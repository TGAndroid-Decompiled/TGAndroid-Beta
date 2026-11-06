package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f39609a;
    public final a3 f39610b;

    public y2(a3 a3Var, int i7) {
        this.f39609a = i7;
        this.f39610b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39609a) {
            case 0:
                a3 a3Var = this.f39610b;
                a3Var.f39050r = 0;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f39610b;
                a3Var2.f39051s = 0;
                a3Var2.invalidate();
                return;
        }
    }
}
