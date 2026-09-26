package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bx0 extends AnimatorListenerAdapter {
    public final int f23149a;
    public final cx0 f23150b;

    public bx0(cx0 cx0Var, int i10) {
        this.f23149a = i10;
        this.f23150b = cx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23149a) {
            case 0:
                cx0 cx0Var = this.f23150b;
                cx0Var.f23430y = 1.0f;
                cx0Var.invalidate();
                cx0Var.G = null;
                return;
            case 1:
                cx0 cx0Var2 = this.f23150b;
                cx0Var2.m(((Float) cx0Var2.v.getAnimatedValue()).floatValue());
                cx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f23150b.F = null;
                return;
        }
    }
}
