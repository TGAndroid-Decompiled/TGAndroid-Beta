package org.telegram.ui;

import android.animation.ValueAnimator;
public final class c61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35705a;
    public final f61 f35706b;

    public c61(f61 f61Var, int i10) {
        this.f35705a = i10;
        this.f35706b = f61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35705a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var = this.f35706b;
                f61Var.K = floatValue;
                f61Var.S.f42314e0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var2 = this.f35706b;
                f61Var2.K = floatValue2;
                f61Var2.S.f42314e0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var3 = this.f35706b;
                f61Var3.K = floatValue3;
                f61Var3.S.f42314e0.invalidate();
                return;
        }
    }
}
