package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33080a;
    public final qg0 f33081b;

    public dd0(qg0 qg0Var, int i10) {
        this.f33080a = i10;
        this.f33081b = qg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33080a) {
            case 0:
                qg0 qg0Var = this.f33081b;
                qg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.f36888c.setAlpha(floatValue);
                qg0Var.f36888c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                qg0 qg0Var2 = this.f33081b;
                qg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.f36888c.setAlpha(floatValue2);
                qg0Var2.f36888c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                qg0 qg0Var3 = this.f33081b;
                qg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                qg0Var3.V.setScaleX(f7);
                qg0Var3.V.setScaleY(f7);
                qg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
