package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30119a;
    public final y00 f30120b;

    public x00(y00 y00Var, int i10) {
        this.f30119a = i10;
        this.f30120b = y00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30119a) {
            case 0:
                y00 y00Var = this.f30120b;
                y00Var.getClass();
                y00Var.f30421x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 1:
                y00 y00Var2 = this.f30120b;
                y00Var2.getClass();
                y00Var2.f30419s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                y00Var2.invalidate();
                return;
            default:
                y00 y00Var3 = this.f30120b;
                y00Var3.getClass();
                y00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var3.invalidate();
                return;
        }
    }
}
