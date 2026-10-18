package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36394a;
    public final z51 f36395b;
    public final boolean f36396c;

    public e41(z51 z51Var, boolean z10, int i10) {
        this.f36394a = i10;
        this.f36395b = z51Var;
        this.f36396c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36394a) {
            case 0:
                z51 z51Var = this.f36395b;
                w41 w41Var = z51Var.f43622h0;
                m41 m41Var = z51Var.f43624i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36396c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w41Var.setAlpha(f7);
                w41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m41Var.setAlpha(floatValue);
                m41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z51Var.f43626j0.setAlpha(m41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36396c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z51 z51Var2 = this.f36395b;
                z51Var2.f43626j0.setAlpha(z51Var2.f43624i0.getAlpha() * floatValue2);
                return;
        }
    }
}
