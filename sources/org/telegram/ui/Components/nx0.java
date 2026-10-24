package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx0 extends AnimatorListenerAdapter {
    public final int f29075a;
    public final ox0 f29076b;

    public nx0(ox0 ox0Var, int i10) {
        this.f29075a = i10;
        this.f29076b = ox0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29075a) {
            case 0:
                ox0 ox0Var = this.f29076b;
                ox0Var.f29426y = 1.0f;
                ox0Var.invalidate();
                ox0Var.G = null;
                return;
            case 1:
                ox0 ox0Var2 = this.f29076b;
                ox0Var2.m(((Float) ox0Var2.v.getAnimatedValue()).floatValue());
                ox0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f29076b.F = null;
                return;
        }
    }
}
