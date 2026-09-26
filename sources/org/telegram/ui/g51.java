package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33828a;
    public final a71 f33829b;
    public final boolean f33830c;

    public g51(a71 a71Var, boolean z10, int i10) {
        this.f33828a = i10;
        this.f33829b = a71Var;
        this.f33830c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33828a) {
            case 0:
                a71 a71Var = this.f33829b;
                x51 x51Var = a71Var.f32026h0;
                n51 n51Var = a71Var.f32028i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33830c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x51Var.setAlpha(f7);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n51Var.setAlpha(floatValue);
                n51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a71Var.f32030j0.setAlpha(n51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33830c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a71 a71Var2 = this.f33829b;
                a71Var2.f32030j0.setAlpha(a71Var2.f32028i0.getAlpha() * floatValue2);
                return;
        }
    }
}
