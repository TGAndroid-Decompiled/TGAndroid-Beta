package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ox0 extends AnimatorListenerAdapter {
    public final int f28109a;
    public final px0 f28110b;

    public ox0(px0 px0Var, int i10) {
        this.f28109a = i10;
        this.f28110b = px0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28109a) {
            case 0:
                px0 px0Var = this.f28110b;
                px0Var.f28445y = 1.0f;
                px0Var.invalidate();
                px0Var.G = null;
                return;
            case 1:
                px0 px0Var2 = this.f28110b;
                px0Var2.m(((Float) px0Var2.v.getAnimatedValue()).floatValue());
                px0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28110b.F = null;
                return;
        }
    }
}
