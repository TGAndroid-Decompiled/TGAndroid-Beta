package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l81 extends AnimatorListenerAdapter {
    public final int f49478a;
    public final p81 f49479b;

    public l81(p81 p81Var, int i7) {
        this.f49478a = i7;
        this.f49479b = p81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49478a) {
            case 0:
                p81 p81Var = this.f49479b;
                p81Var.f50772w = 0;
                p81Var.f50769n.setVisibility(8);
                return;
            case 1:
                this.f49479b.f50772w = 0;
                return;
            default:
                this.f49479b.G.setVisibility(8);
                return;
        }
    }
}
