package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ce0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32649a;
    public final ee0 f32650b;

    public ce0(ee0 ee0Var, int i7) {
        this.f32649a = i7;
        this.f32650b = ee0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32649a) {
            case 0:
                ee0 ee0Var = this.f32650b;
                ee0Var.getClass();
                ee0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.invalidate();
                return;
            default:
                ee0 ee0Var2 = this.f32650b;
                ee0Var2.getClass();
                ee0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var2.invalidate();
                return;
        }
    }
}
