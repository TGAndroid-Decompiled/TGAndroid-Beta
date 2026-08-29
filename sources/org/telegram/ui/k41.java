package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39750a;
    public final d61 f39751b;
    public final boolean f39752c;

    public k41(d61 d61Var, boolean z10, int i10) {
        this.f39750a = i10;
        this.f39751b = d61Var;
        this.f39752c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39750a) {
            case 0:
                d61 d61Var = this.f39751b;
                a51 a51Var = d61Var.f37326d0;
                q41 q41Var = d61Var.f37329e0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39752c) {
                    floatValue = 1.0f - floatValue;
                }
                float f9 = 1.0f - floatValue;
                a51Var.setAlpha(f9);
                a51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                q41Var.setAlpha(floatValue);
                q41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f9);
                d61Var.f37332f0.setAlpha(q41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39752c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                d61 d61Var2 = this.f39751b;
                d61Var2.f37332f0.setAlpha(d61Var2.f37329e0.getAlpha() * floatValue2);
                return;
        }
    }
}
