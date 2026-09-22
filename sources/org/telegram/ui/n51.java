package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35891a;
    public final h71 f35892b;
    public final boolean f35893c;

    public n51(h71 h71Var, boolean z10, int i10) {
        this.f35891a = i10;
        this.f35892b = h71Var;
        this.f35893c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35891a) {
            case 0:
                h71 h71Var = this.f35892b;
                e61 e61Var = h71Var.f34132h0;
                u51 u51Var = h71Var.f34134i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35893c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                e61Var.setAlpha(f7);
                e61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                u51Var.setAlpha(floatValue);
                u51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                h71Var.f34136j0.setAlpha(u51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35893c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                h71 h71Var2 = this.f35892b;
                h71Var2.f34136j0.setAlpha(h71Var2.f34134i0.getAlpha() * floatValue2);
                return;
        }
    }
}
