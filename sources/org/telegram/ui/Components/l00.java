package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class l00 implements ValueAnimator.AnimatorUpdateListener {

    public final int f30241a;

    public final m00 f30242b;

    public l00(m00 m00Var, int i10) {
        this.f30241a = i10;
        this.f30242b = m00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30241a) {
            case 0:
                m00 m00Var = this.f30242b;
                m00Var.getClass();
                m00Var.f30507x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m00Var.invalidate();
                break;
            case 1:
                m00 m00Var2 = this.f30242b;
                m00Var2.getClass();
                m00Var2.f30505s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m00Var2.invalidate();
                break;
            default:
                m00 m00Var3 = this.f30242b;
                m00Var3.getClass();
                m00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m00Var3.invalidate();
                break;
        }
    }
}
