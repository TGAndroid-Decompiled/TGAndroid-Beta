package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l81 extends AnimatorListenerAdapter {
    public final int f49498a;
    public final p81 f49499b;

    public l81(p81 p81Var, int i7) {
        this.f49498a = i7;
        this.f49499b = p81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49498a) {
            case 0:
                p81 p81Var = this.f49499b;
                p81Var.f50790w = 0;
                p81Var.f50787n.setVisibility(8);
                return;
            case 1:
                this.f49499b.f50790w = 0;
                return;
            default:
                this.f49499b.G.setVisibility(8);
                return;
        }
    }
}
