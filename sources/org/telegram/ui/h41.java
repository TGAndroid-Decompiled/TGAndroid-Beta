package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39889a;
    public final c61 f39890b;
    public final boolean f39891c;

    public h41(c61 c61Var, boolean z10, int i10) {
        this.f39889a = i10;
        this.f39890b = c61Var;
        this.f39891c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39889a) {
            case 0:
                c61 c61Var = this.f39890b;
                z41 z41Var = c61Var.f38296h0;
                p41 p41Var = c61Var.f38298i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39891c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z41Var.setAlpha(f7);
                z41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p41Var.setAlpha(floatValue);
                p41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c61Var.f38300j0.setAlpha(p41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39891c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c61 c61Var2 = this.f39890b;
                c61Var2.f38300j0.setAlpha(c61Var2.f38298i0.getAlpha() * floatValue2);
                return;
        }
    }
}
