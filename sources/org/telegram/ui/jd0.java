package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38916a;
    public final wg0 f38917b;

    public jd0(wg0 wg0Var, int i10) {
        this.f38916a = i10;
        this.f38917b = wg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38916a) {
            case 0:
                wg0 wg0Var = this.f38917b;
                wg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var.f43578c.setAlpha(floatValue);
                wg0Var.f43578c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                wg0 wg0Var2 = this.f38917b;
                wg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                wg0Var2.V.setScaleX(f7);
                wg0Var2.V.setScaleY(f7);
                wg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                wg0 wg0Var3 = this.f38917b;
                wg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var3.f43578c.setAlpha(floatValue3);
                wg0Var3.f43578c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
