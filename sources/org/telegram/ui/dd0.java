package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33447a;
    public final pg0 f33448b;

    public dd0(pg0 pg0Var, int i10) {
        this.f33447a = i10;
        this.f33448b = pg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33447a) {
            case 0:
                pg0 pg0Var = this.f33448b;
                pg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.f37130c.setAlpha(floatValue);
                pg0Var.f37130c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                pg0 pg0Var2 = this.f33448b;
                pg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.f37130c.setAlpha(floatValue2);
                pg0Var2.f37130c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                pg0 pg0Var3 = this.f33448b;
                pg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                pg0Var3.S.setScaleX(f10);
                pg0Var3.S.setScaleY(f10);
                pg0Var3.S.setAlpha(floatValue3);
                return;
        }
    }
}
