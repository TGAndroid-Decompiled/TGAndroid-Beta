package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24242a;
    public final hg0 f24243b;

    public fg0(hg0 hg0Var, int i10) {
        this.f24242a = i10;
        this.f24243b = hg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24242a) {
            case 0:
                hg0 hg0Var = this.f24243b;
                hg0Var.getClass();
                hg0Var.f24824y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.invalidate();
                return;
            default:
                hg0 hg0Var2 = this.f24243b;
                hg0Var2.getClass();
                hg0Var2.f24824y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.invalidate();
                return;
        }
    }
}
