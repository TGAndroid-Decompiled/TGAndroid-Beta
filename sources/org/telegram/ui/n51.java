package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35819a;
    public final g71 f35820b;
    public final boolean f35821c;

    public n51(g71 g71Var, boolean z10, int i10) {
        this.f35819a = i10;
        this.f35820b = g71Var;
        this.f35821c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35819a) {
            case 0:
                g71 g71Var = this.f35820b;
                d61 d61Var = g71Var.f33728h0;
                t51 t51Var = g71Var.f33730i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35821c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                d61Var.setAlpha(f7);
                d61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                t51Var.setAlpha(floatValue);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                g71Var.f33732j0.setAlpha(t51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35821c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g71 g71Var2 = this.f35820b;
                g71Var2.f33732j0.setAlpha(g71Var2.f33730i0.getAlpha() * floatValue2);
                return;
        }
    }
}
