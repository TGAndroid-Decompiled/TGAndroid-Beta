package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40676a;
    public final k71 f40677b;
    public final boolean f40678c;

    public p51(k71 k71Var, boolean z10, int i10) {
        this.f40676a = i10;
        this.f40677b = k71Var;
        this.f40678c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40676a) {
            case 0:
                k71 k71Var = this.f40677b;
                h61 h61Var = k71Var.f39132h0;
                x51 x51Var = k71Var.f39134i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40678c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                h61Var.setAlpha(f7);
                h61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                x51Var.setAlpha(floatValue);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                k71Var.f39136j0.setAlpha(x51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40678c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                k71 k71Var2 = this.f40677b;
                k71Var2.f39136j0.setAlpha(k71Var2.f39134i0.getAlpha() * floatValue2);
                return;
        }
    }
}
