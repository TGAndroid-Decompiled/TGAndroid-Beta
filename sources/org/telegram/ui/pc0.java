package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40188a;
    public final dg0 f40189b;

    public pc0(dg0 dg0Var, int i10) {
        this.f40188a = i10;
        this.f40189b = dg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40188a) {
            case 0:
                dg0 dg0Var = this.f40189b;
                dg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.f36370c.setAlpha(floatValue);
                dg0Var.f36370c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                dg0 dg0Var2 = this.f40189b;
                dg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                dg0Var2.V.setScaleX(f7);
                dg0Var2.V.setScaleY(f7);
                dg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                dg0 dg0Var3 = this.f40189b;
                dg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var3.f36370c.setAlpha(floatValue3);
                dg0Var3.f36370c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
