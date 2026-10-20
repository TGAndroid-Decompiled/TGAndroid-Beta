package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35809a;
    public final x51 f35810b;
    public final boolean f35811c;

    public c41(x51 x51Var, boolean z10, int i10) {
        this.f35809a = i10;
        this.f35810b = x51Var;
        this.f35811c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35809a) {
            case 0:
                x51 x51Var = this.f35810b;
                u41 u41Var = x51Var.f43061h0;
                k41 k41Var = x51Var.f43063i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35811c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                u41Var.setAlpha(f7);
                u41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                k41Var.setAlpha(floatValue);
                k41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                x51Var.f43065j0.setAlpha(k41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35811c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                x51 x51Var2 = this.f35810b;
                x51Var2.f43065j0.setAlpha(x51Var2.f43063i0.getAlpha() * floatValue2);
                return;
        }
    }
}
