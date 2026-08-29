package org.telegram.ui;

import android.animation.ValueAnimator;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39434a;
    public final m51 f39435b;

    public j51(m51 m51Var, int i10) {
        this.f39434a = i10;
        this.f39435b = m51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39434a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var = this.f39435b;
                m51Var.J = floatValue;
                m51Var.R.f37326d0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var2 = this.f39435b;
                m51Var2.J = floatValue2;
                m51Var2.R.f37326d0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var3 = this.f39435b;
                m51Var3.J = floatValue3;
                m51Var3.R.f37326d0.invalidate();
                return;
        }
    }
}
