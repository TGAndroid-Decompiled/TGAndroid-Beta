package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32744a;
    public final f11 f32745b;

    public d11(f11 f11Var, int i7) {
        this.f32744a = i7;
        this.f32745b = f11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32744a) {
            case 0:
                f11 f11Var = this.f32745b;
                f11Var.getClass();
                f11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11Var.h();
                f11Var.g();
                return;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f11 f11Var2 = this.f32745b;
                f11Var2.L = max;
                f11Var2.h.invalidate();
                return;
        }
    }
}
