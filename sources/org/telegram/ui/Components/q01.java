package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28038a;
    public final r01 f28039b;

    public q01(r01 r01Var, int i10) {
        this.f28038a = i10;
        this.f28039b = r01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28038a) {
            case 0:
                r01 r01Var = this.f28039b;
                r01Var.getClass();
                r01Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var.invalidate();
                return;
            case 1:
                r01 r01Var2 = this.f28039b;
                r01Var2.getClass();
                r01Var2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var2.invalidate();
                return;
            case 2:
                r01 r01Var3 = this.f28039b;
                r01Var3.getClass();
                r01Var3.f28359f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var3.invalidate();
                return;
            case 3:
                r01 r01Var4 = this.f28039b;
                r01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var4.f28362s = floatValue;
                r01Var4.f28363w = (int) ((r01Var4.h * floatValue) + 0);
                r01Var4.invalidate();
                return;
            default:
                r01 r01Var5 = this.f28039b;
                r01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var5.v = floatValue2;
                int i10 = r01Var5.f28361r;
                r01Var5.f28364x = i10 + ((int) Math.ceil((r01Var5.f28360n - i10) * floatValue2));
                r01Var5.invalidate();
                return;
        }
    }
}
