package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class h41 implements ValueAnimator.AnimatorUpdateListener {

    public final int f38679a;

    public final a61 f38680b;

    public final boolean f38681c;

    public h41(a61 a61Var, boolean z10, int i10) {
        this.f38679a = i10;
        this.f38680b = a61Var;
        this.f38681c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38679a) {
            case 0:
                a61 a61Var = this.f38680b;
                x41 x41Var = a61Var.f36392d0;
                n41 n41Var = a61Var.f36395e0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f38681c) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                float f10 = 1.0f - fFloatValue;
                x41Var.setAlpha(f10);
                x41Var.setTranslationY(AndroidUtilities.dp(8.0f) * fFloatValue);
                n41Var.setAlpha(fFloatValue);
                n41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                a61Var.f36398f0.setAlpha(n41Var.getAlpha() * fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f38681c) {
                    fFloatValue2 = 1.0f - fFloatValue2;
                }
                a61 a61Var2 = this.f38680b;
                a61Var2.f36398f0.setAlpha(a61Var2.f36395e0.getAlpha() * fFloatValue2);
                break;
        }
    }
}
