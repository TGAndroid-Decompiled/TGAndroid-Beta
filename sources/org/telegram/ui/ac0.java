package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ac0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35621a;
    public final hf0 f35622b;

    public ac0(hf0 hf0Var, int i10) {
        this.f35621a = i10;
        this.f35622b = hf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35621a) {
            case 0:
                hf0 hf0Var = this.f35622b;
                hf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf0Var.f37922c.setAlpha(floatValue);
                hf0Var.f37922c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(230.0f));
                return;
            case 1:
                hf0 hf0Var2 = this.f35622b;
                hf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                hf0Var2.V.setScaleX(f7);
                hf0Var2.V.setScaleY(f7);
                hf0Var2.V.setAlpha(floatValue2);
                return;
            default:
                hf0 hf0Var3 = this.f35622b;
                hf0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf0Var3.f37922c.setAlpha(floatValue3);
                hf0Var3.f37922c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.i0.L(230.0f));
                return;
        }
    }
}
