package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l81 extends AnimatorListenerAdapter {
    public final int f49500a;
    public final p81 f49501b;

    public l81(p81 p81Var, int i7) {
        this.f49500a = i7;
        this.f49501b = p81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49500a) {
            case 0:
                p81 p81Var = this.f49501b;
                p81Var.f50823w = 0;
                p81Var.f50820n.setVisibility(8);
                return;
            case 1:
                this.f49501b.f50823w = 0;
                return;
            default:
                this.f49501b.G.setVisibility(8);
                return;
        }
    }
}
