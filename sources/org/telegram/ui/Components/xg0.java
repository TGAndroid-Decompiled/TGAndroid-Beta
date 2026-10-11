package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32916a;
    public final zg0 f32917b;

    public xg0(zg0 zg0Var, int i10) {
        this.f32916a = i10;
        this.f32917b = zg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32916a) {
            case 0:
                zg0 zg0Var = this.f32917b;
                zg0Var.getClass();
                zg0Var.f33525y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0Var.invalidate();
                return;
            default:
                zg0 zg0Var2 = this.f32917b;
                zg0Var2.getClass();
                zg0Var2.f33525y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0Var2.invalidate();
                return;
        }
    }
}
