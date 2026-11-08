package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f46903a;
    public final n81 f46904b;

    public j81(n81 n81Var, int i7) {
        this.f46903a = i7;
        this.f46904b = n81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46903a) {
            case 0:
                n81 n81Var = this.f46904b;
                n81Var.f48004w = 0;
                n81Var.f48001n.setVisibility(8);
                return;
            case 1:
                this.f46904b.f48004w = 0;
                return;
            default:
                this.f46904b.F.setVisibility(8);
                return;
        }
    }
}
