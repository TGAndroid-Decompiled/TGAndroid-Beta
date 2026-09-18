package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35037a;
    public final xg0 f35038b;

    public kd0(xg0 xg0Var, int i10) {
        this.f35037a = i10;
        this.f35038b = xg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35037a) {
            case 0:
                xg0 xg0Var = this.f35038b;
                xg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var.f39465c.setAlpha(floatValue);
                xg0Var.f39465c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                xg0 xg0Var2 = this.f35038b;
                xg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var2.f39465c.setAlpha(floatValue2);
                xg0Var2.f39465c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                xg0 xg0Var3 = this.f35038b;
                xg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                xg0Var3.V.setScaleX(f7);
                xg0Var3.V.setScaleY(f7);
                xg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
