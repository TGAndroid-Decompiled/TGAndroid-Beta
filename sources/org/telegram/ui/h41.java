package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39892a;
    public final c61 f39893b;
    public final boolean f39894c;

    public h41(c61 c61Var, boolean z10, int i10) {
        this.f39892a = i10;
        this.f39893b = c61Var;
        this.f39894c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39892a) {
            case 0:
                c61 c61Var = this.f39893b;
                z41 z41Var = c61Var.f38299h0;
                p41 p41Var = c61Var.f38301i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39894c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z41Var.setAlpha(f7);
                z41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p41Var.setAlpha(floatValue);
                p41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c61Var.f38303j0.setAlpha(p41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39894c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c61 c61Var2 = this.f39893b;
                c61Var2.f38303j0.setAlpha(c61Var2.f38301i0.getAlpha() * floatValue2);
                return;
        }
    }
}
