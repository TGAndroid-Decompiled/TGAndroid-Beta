package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40192a;
    public final vy0 f40193b;

    public uy0(vy0 vy0Var, int i7) {
        this.f40192a = i7;
        this.f40193b = vy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40192a) {
            case 0:
                vy0 vy0Var = this.f40193b;
                vy0Var.getClass();
                vy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var.invalidate();
                return;
            case 1:
                vy0 vy0Var2 = this.f40193b;
                vy0Var2.getClass();
                vy0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var2.invalidate();
                return;
            case 2:
                vy0 vy0Var3 = this.f40193b;
                vy0Var3.getClass();
                vy0Var3.f41187f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var3.invalidate();
                return;
            case 3:
                vy0 vy0Var4 = this.f40193b;
                vy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var4.f41190s = floatValue;
                vy0Var4.f41192x = (int) ((vy0Var4.h * floatValue) + 0);
                vy0Var4.invalidate();
                return;
            default:
                vy0 vy0Var5 = this.f40193b;
                vy0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var5.f41191w = floatValue2;
                int i7 = vy0Var5.f41189r;
                vy0Var5.f41193y = i7 + ((int) Math.ceil((vy0Var5.f41188n - i7) * floatValue2));
                vy0Var5.invalidate();
                return;
        }
    }
}
