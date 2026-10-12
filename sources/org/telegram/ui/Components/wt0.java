package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32548a;
    public final av0 f32549b;
    public final hw0 f32550c;

    public wt0(hw0 hw0Var, av0 av0Var, int i10) {
        this.f32548a = i10;
        this.f32550c = hw0Var;
        this.f32549b = av0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32548a) {
            case 0:
                this.f32550c.f26939n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32549b.h.invalidate();
                return;
            default:
                this.f32550c.f26939n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32549b.h.invalidate();
                return;
        }
    }
}
