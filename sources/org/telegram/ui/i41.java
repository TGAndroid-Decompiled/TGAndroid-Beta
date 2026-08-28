package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39004a;
    public final b61 f39005b;
    public final boolean f39006c;

    public i41(b61 b61Var, boolean z10, int i9) {
        this.f39004a = i9;
        this.f39005b = b61Var;
        this.f39006c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39004a) {
            case 0:
                b61 b61Var = this.f39005b;
                y41 y41Var = b61Var.f36669d0;
                o41 o41Var = b61Var.f36672e0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39006c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                y41Var.setAlpha(f10);
                y41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                o41Var.setAlpha(floatValue);
                o41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                b61Var.f36675f0.setAlpha(o41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39006c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                b61 b61Var2 = this.f39005b;
                b61Var2.f36675f0.setAlpha(b61Var2.f36672e0.getAlpha() * floatValue2);
                return;
        }
    }
}
