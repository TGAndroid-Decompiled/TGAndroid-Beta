package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38534a;
    public final uy0 f38535b;

    public ty0(uy0 uy0Var, int i7) {
        this.f38534a = i7;
        this.f38535b = uy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38534a) {
            case 0:
                uy0 uy0Var = this.f38535b;
                uy0Var.getClass();
                uy0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var.invalidate();
                return;
            case 1:
                uy0 uy0Var2 = this.f38535b;
                uy0Var2.getClass();
                uy0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var2.invalidate();
                return;
            case 2:
                uy0 uy0Var3 = this.f38535b;
                uy0Var3.getClass();
                uy0Var3.f38840f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var3.invalidate();
                return;
            case 3:
                uy0 uy0Var4 = this.f38535b;
                uy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var4.f38843s = floatValue;
                uy0Var4.f38845x = (int) ((uy0Var4.h * floatValue) + 0);
                uy0Var4.invalidate();
                return;
            default:
                uy0 uy0Var5 = this.f38535b;
                uy0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var5.f38844w = floatValue2;
                int i7 = uy0Var5.f38842r;
                uy0Var5.f38846y = i7 + ((int) Math.ceil((uy0Var5.f38841n - i7) * floatValue2));
                uy0Var5.invalidate();
                return;
        }
    }
}
