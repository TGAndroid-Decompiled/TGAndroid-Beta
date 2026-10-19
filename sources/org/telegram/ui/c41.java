package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35810a;
    public final x51 f35811b;
    public final boolean f35812c;

    public c41(x51 x51Var, boolean z10, int i10) {
        this.f35810a = i10;
        this.f35811b = x51Var;
        this.f35812c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35810a) {
            case 0:
                x51 x51Var = this.f35811b;
                u41 u41Var = x51Var.f43056h0;
                k41 k41Var = x51Var.f43058i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35812c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                u41Var.setAlpha(f7);
                u41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                k41Var.setAlpha(floatValue);
                k41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                x51Var.f43060j0.setAlpha(k41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35812c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                x51 x51Var2 = this.f35811b;
                x51Var2.f43060j0.setAlpha(x51Var2.f43058i0.getAlpha() * floatValue2);
                return;
        }
    }
}
