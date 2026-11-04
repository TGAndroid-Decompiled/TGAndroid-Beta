package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32903a;
    public final f11 f32904b;

    public d11(f11 f11Var, int i3) {
        this.f32903a = i3;
        this.f32904b = f11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32903a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11 f11Var = this.f32904b;
                f11Var.V = floatValue;
                f11Var.h();
                f11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f11 f11Var2 = this.f32904b;
                f11Var2.M = max;
                f11Var2.h.invalidate();
                return;
        }
    }
}
