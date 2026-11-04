package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40887a;
    public final b11 f40888b;

    public z01(b11 b11Var, int i3) {
        this.f40887a = i3;
        this.f40888b = b11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40887a) {
            case 0:
                ei.e3 e3Var = this.f40888b.f32051f;
                e3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                e3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                e3Var.invalidate();
                return;
            default:
                b11 b11Var = this.f40888b;
                b11Var.getClass();
                b11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.h();
                return;
        }
    }
}
