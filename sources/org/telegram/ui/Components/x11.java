package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32614a;
    public final y11 f32615b;

    public x11(y11 y11Var, int i10) {
        this.f32614a = i10;
        this.f32615b = y11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32614a) {
            case 0:
                y11 y11Var = this.f32615b;
                y11Var.getClass();
                y11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.invalidate();
                return;
            case 1:
                y11 y11Var2 = this.f32615b;
                y11Var2.getClass();
                y11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var2.invalidate();
                return;
            case 2:
                y11 y11Var3 = this.f32615b;
                y11Var3.getClass();
                y11Var3.f32912f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var3.invalidate();
                return;
            case 3:
                y11 y11Var4 = this.f32615b;
                y11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var4.f32915s = floatValue;
                y11Var4.f32916w = (int) ((y11Var4.h * floatValue) + 0);
                y11Var4.invalidate();
                return;
            default:
                y11 y11Var5 = this.f32615b;
                y11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var5.v = floatValue2;
                int i10 = y11Var5.f32914r;
                y11Var5.f32917x = i10 + ((int) Math.ceil((y11Var5.f32913n - i10) * floatValue2));
                y11Var5.invalidate();
                return;
        }
    }
}
