package org.telegram.ui;

import android.animation.ValueAnimator;
public final class na0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47924a;
    public final xd0 f47925b;

    public na0(xd0 xd0Var, int i3) {
        this.f47924a = i3;
        this.f47925b = xd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47924a) {
            case 0:
                xd0 xd0Var = this.f47925b;
                xd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.f51950c.setAlpha(floatValue);
                xd0Var.f51950c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                xd0 xd0Var2 = this.f47925b;
                xd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                xd0Var2.W.setScaleX(f10);
                xd0Var2.W.setScaleY(f10);
                xd0Var2.W.setAlpha(floatValue2);
                return;
            default:
                xd0 xd0Var3 = this.f47925b;
                xd0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var3.f51950c.setAlpha(floatValue3);
                xd0Var3.f51950c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
