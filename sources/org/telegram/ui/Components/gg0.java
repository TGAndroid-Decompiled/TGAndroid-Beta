package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26919a;
    public final ig0 f26920b;

    public gg0(ig0 ig0Var, int i10) {
        this.f26919a = i10;
        this.f26920b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26919a) {
            case 0:
                ig0 ig0Var = this.f26920b;
                ig0Var.getClass();
                ig0Var.f27512y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.invalidate();
                return;
            default:
                ig0 ig0Var2 = this.f26920b;
                ig0Var2.getClass();
                ig0Var2.f27512y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.invalidate();
                return;
        }
    }
}
