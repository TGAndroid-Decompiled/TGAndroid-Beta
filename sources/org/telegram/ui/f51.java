package org.telegram.ui;

import android.animation.ValueAnimator;
public final class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36809a;
    public final i51 f36810b;

    public f51(i51 i51Var, int i10) {
        this.f36809a = i10;
        this.f36810b = i51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36809a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var = this.f36810b;
                i51Var.N = floatValue;
                i51Var.V.f43596h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var2 = this.f36810b;
                i51Var2.N = floatValue2;
                i51Var2.V.f43596h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var3 = this.f36810b;
                i51Var3.N = floatValue3;
                i51Var3.V.f43596h0.invalidate();
                return;
        }
    }
}
