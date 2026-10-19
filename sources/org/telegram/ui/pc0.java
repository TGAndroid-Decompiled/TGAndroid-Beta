package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40191a;
    public final cg0 f40192b;

    public pc0(cg0 cg0Var, int i10) {
        this.f40191a = i10;
        this.f40192b = cg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40191a) {
            case 0:
                cg0 cg0Var = this.f40192b;
                cg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var.f35968c.setAlpha(floatValue);
                cg0Var.f35968c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                cg0 cg0Var2 = this.f40192b;
                cg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                cg0Var2.V.setScaleX(f7);
                cg0Var2.V.setScaleY(f7);
                cg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                cg0 cg0Var3 = this.f40192b;
                cg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var3.f35968c.setAlpha(floatValue3);
                cg0Var3.f35968c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
