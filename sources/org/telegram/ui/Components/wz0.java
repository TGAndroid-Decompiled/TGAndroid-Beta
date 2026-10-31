package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32287a;
    public final xz0 f32288b;

    public wz0(xz0 xz0Var, int i10) {
        this.f32287a = i10;
        this.f32288b = xz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32287a) {
            case 0:
                xz0 xz0Var = this.f32288b;
                xz0Var.getClass();
                xz0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var.invalidate();
                return;
            case 1:
                xz0 xz0Var2 = this.f32288b;
                xz0Var2.getClass();
                xz0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var2.invalidate();
                return;
            case 2:
                xz0 xz0Var3 = this.f32288b;
                xz0Var3.getClass();
                xz0Var3.f32578f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var3.invalidate();
                return;
            case 3:
                xz0 xz0Var4 = this.f32288b;
                xz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var4.f32581s = floatValue;
                xz0Var4.f32583x = (int) ((xz0Var4.h * floatValue) + 0);
                xz0Var4.invalidate();
                return;
            default:
                xz0 xz0Var5 = this.f32288b;
                xz0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var5.f32582w = floatValue2;
                int i10 = xz0Var5.f32580r;
                xz0Var5.f32584y = i10 + ((int) Math.ceil((xz0Var5.f32579n - i10) * floatValue2));
                xz0Var5.invalidate();
                return;
        }
    }
}
