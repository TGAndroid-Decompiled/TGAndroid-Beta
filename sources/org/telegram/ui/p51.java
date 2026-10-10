package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40720a;
    public final k71 f40721b;
    public final boolean f40722c;

    public p51(k71 k71Var, boolean z10, int i10) {
        this.f40720a = i10;
        this.f40721b = k71Var;
        this.f40722c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40720a) {
            case 0:
                k71 k71Var = this.f40721b;
                h61 h61Var = k71Var.f39176h0;
                x51 x51Var = k71Var.f39178i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40722c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                h61Var.setAlpha(f7);
                h61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                x51Var.setAlpha(floatValue);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                k71Var.f39180j0.setAlpha(x51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40722c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                k71 k71Var2 = this.f40721b;
                k71Var2.f39180j0.setAlpha(k71Var2.f39178i0.getAlpha() * floatValue2);
                return;
        }
    }
}
