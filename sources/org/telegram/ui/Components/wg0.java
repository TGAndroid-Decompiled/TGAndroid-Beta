package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32700a;
    public final yg0 f32701b;

    public wg0(yg0 yg0Var, int i10) {
        this.f32700a = i10;
        this.f32701b = yg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32700a) {
            case 0:
                yg0 yg0Var = this.f32701b;
                yg0Var.getClass();
                yg0Var.f33255y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var.invalidate();
                return;
            default:
                yg0 yg0Var2 = this.f32701b;
                yg0Var2.getClass();
                yg0Var2.f33255y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var2.invalidate();
                return;
        }
    }
}
