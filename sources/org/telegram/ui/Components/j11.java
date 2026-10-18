package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27396a;
    public final k11 f27397b;

    public j11(k11 k11Var, int i10) {
        this.f27396a = i10;
        this.f27397b = k11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27396a) {
            case 0:
                k11 k11Var = this.f27397b;
                k11Var.getClass();
                k11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var.invalidate();
                return;
            case 1:
                k11 k11Var2 = this.f27397b;
                k11Var2.getClass();
                k11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var2.invalidate();
                return;
            case 2:
                k11 k11Var3 = this.f27397b;
                k11Var3.getClass();
                k11Var3.f27699f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var3.invalidate();
                return;
            case 3:
                k11 k11Var4 = this.f27397b;
                k11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var4.f27702s = floatValue;
                k11Var4.f27703w = (int) ((k11Var4.h * floatValue) + 0);
                k11Var4.invalidate();
                return;
            default:
                k11 k11Var5 = this.f27397b;
                k11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var5.v = floatValue2;
                int i10 = k11Var5.f27701r;
                k11Var5.f27704x = i10 + ((int) Math.ceil((k11Var5.f27700n - i10) * floatValue2));
                k11Var5.invalidate();
                return;
        }
    }
}
