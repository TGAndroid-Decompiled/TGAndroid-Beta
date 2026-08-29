package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32776a;
    public final u00 f32777b;

    public t00(u00 u00Var, int i10) {
        this.f32776a = i10;
        this.f32777b = u00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32776a) {
            case 0:
                u00 u00Var = this.f32777b;
                u00Var.getClass();
                u00Var.f33079x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 1:
                u00 u00Var2 = this.f32777b;
                u00Var2.getClass();
                u00Var2.f33077s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u00Var2.invalidate();
                return;
            default:
                u00 u00Var3 = this.f32777b;
                u00Var3.getClass();
                u00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var3.invalidate();
                return;
        }
    }
}
