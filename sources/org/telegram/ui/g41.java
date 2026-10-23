package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37481a;
    public final b61 f37482b;
    public final boolean f37483c;

    public g41(b61 b61Var, boolean z10, int i10) {
        this.f37481a = i10;
        this.f37482b = b61Var;
        this.f37483c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37481a) {
            case 0:
                b61 b61Var = this.f37482b;
                y41 y41Var = b61Var.f35905h0;
                o41 o41Var = b61Var.f35907i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37483c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                y41Var.setAlpha(f7);
                y41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                o41Var.setAlpha(floatValue);
                o41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                b61Var.f35909j0.setAlpha(o41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37483c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                b61 b61Var2 = this.f37482b;
                b61Var2.f35909j0.setAlpha(b61Var2.f35907i0.getAlpha() * floatValue2);
                return;
        }
    }
}
