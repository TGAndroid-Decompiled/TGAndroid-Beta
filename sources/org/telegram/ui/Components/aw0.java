package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class aw0 extends AnimatorListenerAdapter {

    public final int f26832a;

    public final bw0 f26833b;

    public aw0(bw0 bw0Var, int i10) {
        this.f26832a = i10;
        this.f26833b = bw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26832a) {
            case 0:
                bw0 bw0Var = this.f26833b;
                bw0Var.f27220y = 1.0f;
                bw0Var.invalidate();
                bw0Var.C = null;
                break;
            case 1:
                bw0 bw0Var2 = this.f26833b;
                bw0Var2.m(((Float) bw0Var2.v.getAnimatedValue()).floatValue());
                bw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.f26833b.B = null;
                break;
        }
    }
}
