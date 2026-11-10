package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l81 extends AnimatorListenerAdapter {
    public final int f47547a;
    public final p81 f47548b;

    public l81(p81 p81Var, int i7) {
        this.f47547a = i7;
        this.f47548b = p81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47547a) {
            case 0:
                p81 p81Var = this.f47548b;
                p81Var.f48722w = 0;
                p81Var.f48719n.setVisibility(8);
                return;
            case 1:
                this.f47548b.f48722w = 0;
                return;
            default:
                this.f47548b.F.setVisibility(8);
                return;
        }
    }
}
