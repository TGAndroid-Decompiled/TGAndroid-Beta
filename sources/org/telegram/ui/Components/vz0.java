package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class vz0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f34078a;

    public final wz0 f34079b;

    public vz0(wz0 wz0Var, int i10) {
        this.f34078a = i10;
        this.f34079b = wz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34078a) {
            case 0:
                wz0 wz0Var = this.f34079b;
                wz0Var.getClass();
                wz0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var.invalidate();
                break;
            case 1:
                wz0 wz0Var2 = this.f34079b;
                wz0Var2.getClass();
                wz0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var2.invalidate();
                break;
            case 2:
                wz0 wz0Var3 = this.f34079b;
                wz0Var3.getClass();
                wz0Var3.f34402f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var3.invalidate();
                break;
            case 3:
                wz0 wz0Var4 = this.f34079b;
                wz0Var4.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var4.f34405s = fFloatValue;
                wz0Var4.f34406w = (int) ((wz0Var4.h * fFloatValue) + 0);
                wz0Var4.invalidate();
                break;
            default:
                wz0 wz0Var5 = this.f34079b;
                wz0Var5.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var5.v = fFloatValue2;
                int i10 = wz0Var5.f34404r;
                wz0Var5.f34407x = i10 + ((int) Math.ceil((wz0Var5.f34403n - i10) * fFloatValue2));
                wz0Var5.invalidate();
                break;
        }
    }
}
