package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36390a;
    public final z51 f36391b;
    public final boolean f36392c;

    public e41(z51 z51Var, boolean z10, int i10) {
        this.f36390a = i10;
        this.f36391b = z51Var;
        this.f36392c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36390a) {
            case 0:
                z51 z51Var = this.f36391b;
                w41 w41Var = z51Var.f43596h0;
                m41 m41Var = z51Var.f43598i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36392c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w41Var.setAlpha(f7);
                w41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m41Var.setAlpha(floatValue);
                m41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z51Var.f43600j0.setAlpha(m41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36392c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z51 z51Var2 = this.f36391b;
                z51Var2.f43600j0.setAlpha(z51Var2.f43598i0.getAlpha() * floatValue2);
                return;
        }
    }
}
