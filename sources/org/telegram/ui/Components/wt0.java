package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32549a;
    public final av0 f32550b;
    public final hw0 f32551c;

    public wt0(hw0 hw0Var, av0 av0Var, int i10) {
        this.f32549a = i10;
        this.f32551c = hw0Var;
        this.f32550b = av0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32549a) {
            case 0:
                this.f32551c.f26954n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32550b.h.invalidate();
                return;
            default:
                this.f32551c.f26954n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32550b.h.invalidate();
                return;
        }
    }
}
