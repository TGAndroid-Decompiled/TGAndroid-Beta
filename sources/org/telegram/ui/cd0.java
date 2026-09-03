package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35773a;
    public final og0 f35774b;

    public cd0(og0 og0Var, int i10) {
        this.f35773a = i10;
        this.f35774b = og0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35773a) {
            case 0:
                og0 og0Var = this.f35774b;
                og0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var.f39714c.setAlpha(floatValue);
                og0Var.f39714c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                og0 og0Var2 = this.f35774b;
                og0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var2.f39714c.setAlpha(floatValue2);
                og0Var2.f39714c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                og0 og0Var3 = this.f35774b;
                og0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                og0Var3.S.setScaleX(f10);
                og0Var3.S.setScaleY(f10);
                og0Var3.S.setAlpha(floatValue3);
                return;
        }
    }
}
