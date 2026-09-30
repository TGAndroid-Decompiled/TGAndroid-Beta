package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24564a;
    public final ig0 f24565b;

    public gg0(ig0 ig0Var, int i10) {
        this.f24564a = i10;
        this.f24565b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24564a) {
            case 0:
                ig0 ig0Var = this.f24565b;
                ig0Var.getClass();
                ig0Var.f25121y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.invalidate();
                return;
            default:
                ig0 ig0Var2 = this.f24565b;
                ig0Var2.getClass();
                ig0Var2.f25121y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.invalidate();
                return;
        }
    }
}
