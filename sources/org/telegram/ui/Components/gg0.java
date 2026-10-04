package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26865a;
    public final ig0 f26866b;

    public gg0(ig0 ig0Var, int i10) {
        this.f26865a = i10;
        this.f26866b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26865a) {
            case 0:
                ig0 ig0Var = this.f26866b;
                ig0Var.getClass();
                ig0Var.f27412y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.invalidate();
                return;
            default:
                ig0 ig0Var2 = this.f26866b;
                ig0Var2.getClass();
                ig0Var2.f27412y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.invalidate();
                return;
        }
    }
}
