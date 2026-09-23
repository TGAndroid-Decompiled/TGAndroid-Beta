package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33092a;
    public final z61 f33093b;
    public final boolean f33094c;

    public f51(z61 z61Var, boolean z10, int i10) {
        this.f33092a = i10;
        this.f33093b = z61Var;
        this.f33094c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33092a) {
            case 0:
                z61 z61Var = this.f33093b;
                w51 w51Var = z61Var.f40021h0;
                m51 m51Var = z61Var.f40023i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33094c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                w51Var.setAlpha(f7);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                m51Var.setAlpha(floatValue);
                m51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                z61Var.f40025j0.setAlpha(m51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33094c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                z61 z61Var2 = this.f33093b;
                z61Var2.f40025j0.setAlpha(z61Var2.f40023i0.getAlpha() * floatValue2);
                return;
        }
    }
}
