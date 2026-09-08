package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37776a;
    public final wg0 f37777b;

    public jd0(wg0 wg0Var, int i10) {
        this.f37776a = i10;
        this.f37777b = wg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37776a) {
            case 0:
                wg0 wg0Var = this.f37777b;
                wg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var.f42390c.setAlpha(floatValue);
                wg0Var.f42390c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                wg0 wg0Var2 = this.f37777b;
                wg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var2.f42390c.setAlpha(floatValue2);
                wg0Var2.f42390c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                wg0 wg0Var3 = this.f37777b;
                wg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                wg0Var3.V.setScaleX(f7);
                wg0Var3.V.setScaleY(f7);
                wg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
