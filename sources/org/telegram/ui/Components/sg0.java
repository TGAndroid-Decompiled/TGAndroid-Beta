package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32592a;
    public final ug0 f32593b;

    public sg0(ug0 ug0Var, int i10) {
        this.f32592a = i10;
        this.f32593b = ug0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32592a) {
            case 0:
                ug0 ug0Var = this.f32593b;
                ug0Var.getClass();
                ug0Var.f33402y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.invalidate();
                return;
            default:
                ug0 ug0Var2 = this.f32593b;
                ug0Var2.getClass();
                ug0Var2.f33402y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.invalidate();
                return;
        }
    }
}
