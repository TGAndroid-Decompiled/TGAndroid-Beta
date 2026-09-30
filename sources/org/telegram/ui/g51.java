package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33970a;
    public final a71 f33971b;
    public final boolean f33972c;

    public g51(a71 a71Var, boolean z10, int i10) {
        this.f33970a = i10;
        this.f33971b = a71Var;
        this.f33972c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33970a) {
            case 0:
                a71 a71Var = this.f33971b;
                x51 x51Var = a71Var.f32101h0;
                n51 n51Var = a71Var.f32103i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33972c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x51Var.setAlpha(f7);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n51Var.setAlpha(floatValue);
                n51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a71Var.f32105j0.setAlpha(n51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33972c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a71 a71Var2 = this.f33971b;
                a71Var2.f32105j0.setAlpha(a71Var2.f32103i0.getAlpha() * floatValue2);
                return;
        }
    }
}
