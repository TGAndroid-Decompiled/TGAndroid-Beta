package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35814a;
    public final x51 f35815b;
    public final boolean f35816c;

    public c41(x51 x51Var, boolean z10, int i10) {
        this.f35814a = i10;
        this.f35815b = x51Var;
        this.f35816c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35814a) {
            case 0:
                x51 x51Var = this.f35815b;
                u41 u41Var = x51Var.f43065h0;
                k41 k41Var = x51Var.f43067i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35816c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                u41Var.setAlpha(f7);
                u41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                k41Var.setAlpha(floatValue);
                k41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                x51Var.f43069j0.setAlpha(k41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35816c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                x51 x51Var2 = this.f35815b;
                x51Var2.f43069j0.setAlpha(x51Var2.f43067i0.getAlpha() * floatValue2);
                return;
        }
    }
}
