package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33906a;
    public final tg0 f33907b;

    public gd0(tg0 tg0Var, int i10) {
        this.f33906a = i10;
        this.f33907b = tg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33906a) {
            case 0:
                tg0 tg0Var = this.f33907b;
                tg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var.f37788c.setAlpha(floatValue);
                tg0Var.f37788c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                tg0 tg0Var2 = this.f33907b;
                tg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var2.f37788c.setAlpha(floatValue2);
                tg0Var2.f37788c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                tg0 tg0Var3 = this.f33907b;
                tg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                tg0Var3.V.setScaleX(f7);
                tg0Var3.V.setScaleY(f7);
                tg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
