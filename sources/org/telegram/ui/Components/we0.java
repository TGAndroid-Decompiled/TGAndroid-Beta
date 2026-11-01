package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class we0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32223a;
    public final ye0 f32224b;

    public we0(ye0 ye0Var, int i10) {
        this.f32223a = i10;
        this.f32224b = ye0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32223a) {
            case 0:
                ye0 ye0Var = this.f32224b;
                ye0Var.getClass();
                ye0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var.invalidate();
                return;
            default:
                ye0 ye0Var2 = this.f32224b;
                ye0Var2.getClass();
                ye0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var2.invalidate();
                return;
        }
    }
}
