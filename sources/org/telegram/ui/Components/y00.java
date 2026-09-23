package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30115a;
    public final z00 f30116b;

    public y00(z00 z00Var, int i10) {
        this.f30115a = i10;
        this.f30116b = z00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30115a) {
            case 0:
                z00 z00Var = this.f30116b;
                z00Var.getClass();
                z00Var.f30497x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var.invalidate();
                return;
            case 1:
                z00 z00Var2 = this.f30116b;
                z00Var2.getClass();
                z00Var2.f30495s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                z00Var2.invalidate();
                return;
            default:
                z00 z00Var3 = this.f30116b;
                z00Var3.getClass();
                z00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var3.invalidate();
                return;
        }
    }
}
