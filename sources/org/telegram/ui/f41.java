package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37188a;
    public final a61 f37189b;
    public final boolean f37190c;

    public f41(a61 a61Var, boolean z10, int i10) {
        this.f37188a = i10;
        this.f37189b = a61Var;
        this.f37190c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37188a) {
            case 0:
                a61 a61Var = this.f37189b;
                x41 x41Var = a61Var.f35622h0;
                n41 n41Var = a61Var.f35624i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37190c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x41Var.setAlpha(f7);
                x41Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n41Var.setAlpha(floatValue);
                n41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a61Var.f35626j0.setAlpha(n41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37190c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a61 a61Var2 = this.f37189b;
                a61Var2.f35626j0.setAlpha(a61Var2.f35624i0.getAlpha() * floatValue2);
                return;
        }
    }
}
