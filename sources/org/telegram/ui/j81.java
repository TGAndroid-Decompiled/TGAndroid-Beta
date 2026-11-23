package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f49046a;
    public final n81 f49047b;

    public j81(n81 n81Var, int i7) {
        this.f49046a = i7;
        this.f49047b = n81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49046a) {
            case 0:
                n81 n81Var = this.f49047b;
                n81Var.f50269w = 0;
                n81Var.f50266n.setVisibility(8);
                return;
            case 1:
                this.f49047b.f50269w = 0;
                return;
            default:
                this.f49047b.G.setVisibility(8);
                return;
        }
    }
}
