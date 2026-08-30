package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28032a;
    public final r01 f28033b;

    public q01(r01 r01Var, int i10) {
        this.f28032a = i10;
        this.f28033b = r01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28032a) {
            case 0:
                r01 r01Var = this.f28033b;
                r01Var.getClass();
                r01Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var.invalidate();
                return;
            case 1:
                r01 r01Var2 = this.f28033b;
                r01Var2.getClass();
                r01Var2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var2.invalidate();
                return;
            case 2:
                r01 r01Var3 = this.f28033b;
                r01Var3.getClass();
                r01Var3.f28343f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var3.invalidate();
                return;
            case 3:
                r01 r01Var4 = this.f28033b;
                r01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var4.f28346s = floatValue;
                r01Var4.f28347w = (int) ((r01Var4.h * floatValue) + 0);
                r01Var4.invalidate();
                return;
            default:
                r01 r01Var5 = this.f28033b;
                r01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var5.v = floatValue2;
                int i10 = r01Var5.f28345r;
                r01Var5.f28348x = i10 + ((int) Math.ceil((r01Var5.f28344n - i10) * floatValue2));
                r01Var5.invalidate();
                return;
        }
    }
}
