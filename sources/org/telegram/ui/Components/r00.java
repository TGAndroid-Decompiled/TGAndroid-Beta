package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30323a;
    public final y00 f30324b;

    public r00(y00 y00Var, int i10) {
        this.f30323a = i10;
        this.f30324b = y00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30323a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00 y00Var = this.f30324b;
                y00Var.f33086x = floatValue;
                y00Var.invalidate();
                return;
            default:
                y00 y00Var2 = this.f30324b;
                y00Var2.getClass();
                y00Var2.f33087y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var2.invalidate();
                return;
        }
    }
}
