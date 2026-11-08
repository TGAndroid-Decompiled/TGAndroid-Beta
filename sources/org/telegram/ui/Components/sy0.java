package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38174a;
    public final ty0 f38175b;

    public sy0(ty0 ty0Var, int i7) {
        this.f38174a = i7;
        this.f38175b = ty0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38174a) {
            case 0:
                ty0 ty0Var = this.f38175b;
                ty0Var.getClass();
                ty0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var.invalidate();
                return;
            case 1:
                ty0 ty0Var2 = this.f38175b;
                ty0Var2.getClass();
                ty0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var2.invalidate();
                return;
            case 2:
                ty0 ty0Var3 = this.f38175b;
                ty0Var3.getClass();
                ty0Var3.f38459f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var3.invalidate();
                return;
            case 3:
                ty0 ty0Var4 = this.f38175b;
                ty0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var4.f38462s = floatValue;
                ty0Var4.f38464x = (int) ((ty0Var4.h * floatValue) + 0);
                ty0Var4.invalidate();
                return;
            default:
                ty0 ty0Var5 = this.f38175b;
                ty0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var5.f38463w = floatValue2;
                int i7 = ty0Var5.f38461r;
                ty0Var5.f38465y = i7 + ((int) Math.ceil((ty0Var5.f38460n - i7) * floatValue2));
                ty0Var5.invalidate();
                return;
        }
    }
}
