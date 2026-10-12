package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39458a;
    public final xg0 f39459b;

    public kd0(xg0 xg0Var, int i10) {
        this.f39458a = i10;
        this.f39459b = xg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39458a) {
            case 0:
                xg0 xg0Var = this.f39459b;
                xg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var.f43941c.setAlpha(floatValue);
                xg0Var.f43941c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                xg0 xg0Var2 = this.f39459b;
                xg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                xg0Var2.V.setScaleX(f7);
                xg0Var2.V.setScaleY(f7);
                xg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                xg0 xg0Var3 = this.f39459b;
                xg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var3.f43941c.setAlpha(floatValue3);
                xg0Var3.f43941c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
