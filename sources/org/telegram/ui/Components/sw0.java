package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sw0 extends AnimatorListenerAdapter {
    public final int f31188a;
    public final tw0 f31189b;

    public sw0(tw0 tw0Var, int i10) {
        this.f31188a = i10;
        this.f31189b = tw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31188a) {
            case 0:
                tw0 tw0Var = this.f31189b;
                tw0Var.f31469y = 1.0f;
                tw0Var.invalidate();
                tw0Var.D = null;
                return;
            case 1:
                tw0 tw0Var2 = this.f31189b;
                tw0Var2.m(((Float) tw0Var2.v.getAnimatedValue()).floatValue());
                tw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f31189b.C = null;
                return;
        }
    }
}
