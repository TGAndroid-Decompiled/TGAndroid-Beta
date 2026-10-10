package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32670a;
    public final yg0 f32671b;

    public wg0(yg0 yg0Var, int i10) {
        this.f32670a = i10;
        this.f32671b = yg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32670a) {
            case 0:
                yg0 yg0Var = this.f32671b;
                yg0Var.getClass();
                yg0Var.f33201y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var.invalidate();
                return;
            default:
                yg0 yg0Var2 = this.f32671b;
                yg0Var2.getClass();
                yg0Var2.f33201y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var2.invalidate();
                return;
        }
    }
}
