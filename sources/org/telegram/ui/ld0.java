package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35499a;
    public final yg0 f35500b;

    public ld0(yg0 yg0Var, int i10) {
        this.f35499a = i10;
        this.f35500b = yg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35499a) {
            case 0:
                yg0 yg0Var = this.f35500b;
                yg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var.f39887c.setAlpha(floatValue);
                yg0Var.f39887c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                yg0 yg0Var2 = this.f35500b;
                yg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var2.f39887c.setAlpha(floatValue2);
                yg0Var2.f39887c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                yg0 yg0Var3 = this.f35500b;
                yg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                yg0Var3.V.setScaleX(f7);
                yg0Var3.V.setScaleY(f7);
                yg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
