package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ox0 extends AnimatorListenerAdapter {
    public final int f29357a;
    public final px0 f29358b;

    public ox0(px0 px0Var, int i10) {
        this.f29357a = i10;
        this.f29358b = px0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29357a) {
            case 0:
                px0 px0Var = this.f29358b;
                px0Var.f29693y = 1.0f;
                px0Var.invalidate();
                px0Var.G = null;
                return;
            case 1:
                px0 px0Var2 = this.f29358b;
                px0Var2.m(((Float) px0Var2.v.getAnimatedValue()).floatValue());
                px0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f29358b.F = null;
                return;
        }
    }
}
