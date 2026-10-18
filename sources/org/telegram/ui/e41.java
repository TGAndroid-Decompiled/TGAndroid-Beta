package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36357a;
    public final z51 f36358b;
    public final boolean f36359c;

    public e41(z51 z51Var, boolean z10, int i10) {
        this.f36357a = i10;
        this.f36358b = z51Var;
        this.f36359c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36357a) {
            case 0:
                z51 z51Var = this.f36358b;
                w41 w41Var = z51Var.f43586h0;
                m41 m41Var = z51Var.f43588i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36359c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w41Var.setAlpha(f7);
                w41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m41Var.setAlpha(floatValue);
                m41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z51Var.f43590j0.setAlpha(m41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36359c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z51 z51Var2 = this.f36358b;
                z51Var2.f43590j0.setAlpha(z51Var2.f43588i0.getAlpha() * floatValue2);
                return;
        }
    }
}
