package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35533a;
    public final p61 f35534b;

    public m61(p61 p61Var, int i10) {
        this.f35533a = i10;
        this.f35534b = p61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35533a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var = this.f35534b;
                p61Var.N = floatValue;
                p61Var.V.f33728h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var2 = this.f35534b;
                p61Var2.N = floatValue2;
                p61Var2.V.f33728h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var3 = this.f35534b;
                p61Var3.N = floatValue3;
                p61Var3.V.f33728h0.invalidate();
                return;
        }
    }
}
