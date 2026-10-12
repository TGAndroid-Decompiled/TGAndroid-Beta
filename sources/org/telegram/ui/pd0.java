package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39196a;
    public final bh0 f39197b;

    public pd0(bh0 bh0Var, int i10) {
        this.f39196a = i10;
        this.f39197b = bh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39196a) {
            case 0:
                bh0 bh0Var = this.f39197b;
                bh0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var.f34547c.setAlpha(floatValue);
                bh0Var.f34547c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                bh0 bh0Var2 = this.f39197b;
                bh0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                bh0Var2.V.setScaleX(f7);
                bh0Var2.V.setScaleY(f7);
                bh0Var2.V.setAlpha(floatValue2);
                return;
            default:
                bh0 bh0Var3 = this.f39197b;
                bh0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var3.f34547c.setAlpha(floatValue3);
                bh0Var3.f34547c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
