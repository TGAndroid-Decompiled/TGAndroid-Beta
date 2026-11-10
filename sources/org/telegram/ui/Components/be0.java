package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class be0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32225a;
    public final de0 f32226b;

    public be0(de0 de0Var, int i7) {
        this.f32225a = i7;
        this.f32226b = de0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32225a) {
            case 0:
                de0 de0Var = this.f32226b;
                de0Var.getClass();
                de0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.invalidate();
                return;
            default:
                de0 de0Var2 = this.f32226b;
                de0Var2.getClass();
                de0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var2.invalidate();
                return;
        }
    }
}
