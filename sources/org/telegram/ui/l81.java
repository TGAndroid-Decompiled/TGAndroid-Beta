package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l81 extends AnimatorListenerAdapter {
    public final int f49518a;
    public final p81 f49519b;

    public l81(p81 p81Var, int i7) {
        this.f49518a = i7;
        this.f49519b = p81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49518a) {
            case 0:
                p81 p81Var = this.f49519b;
                p81Var.f50813w = 0;
                p81Var.f50810n.setVisibility(8);
                return;
            case 1:
                this.f49519b.f50813w = 0;
                return;
            default:
                this.f49519b.G.setVisibility(8);
                return;
        }
    }
}
