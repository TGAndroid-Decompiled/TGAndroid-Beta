package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30646a;
    public final t11 f30647b;

    public s11(t11 t11Var, int i10) {
        this.f30646a = i10;
        this.f30647b = t11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30646a) {
            case 0:
                t11 t11Var = this.f30647b;
                t11Var.getClass();
                t11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.invalidate();
                return;
            case 1:
                t11 t11Var2 = this.f30647b;
                t11Var2.getClass();
                t11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var2.invalidate();
                return;
            case 2:
                t11 t11Var3 = this.f30647b;
                t11Var3.getClass();
                t11Var3.f30944f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var3.invalidate();
                return;
            case 3:
                t11 t11Var4 = this.f30647b;
                t11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var4.f30947s = floatValue;
                t11Var4.f30948w = (int) ((t11Var4.h * floatValue) + 0);
                t11Var4.invalidate();
                return;
            default:
                t11 t11Var5 = this.f30647b;
                t11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var5.v = floatValue2;
                int i10 = t11Var5.f30946r;
                t11Var5.f30949x = i10 + ((int) Math.ceil((t11Var5.f30945n - i10) * floatValue2));
                t11Var5.invalidate();
                return;
        }
    }
}
