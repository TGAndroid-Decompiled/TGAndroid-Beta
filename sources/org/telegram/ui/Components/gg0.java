package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26864a;
    public final ig0 f26865b;

    public gg0(ig0 ig0Var, int i10) {
        this.f26864a = i10;
        this.f26865b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26864a) {
            case 0:
                ig0 ig0Var = this.f26865b;
                ig0Var.getClass();
                ig0Var.f27411y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.invalidate();
                return;
            default:
                ig0 ig0Var2 = this.f26865b;
                ig0Var2.getClass();
                ig0Var2.f27411y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.invalidate();
                return;
        }
    }
}
