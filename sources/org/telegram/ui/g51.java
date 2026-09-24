package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33814a;
    public final a71 f33815b;
    public final boolean f33816c;

    public g51(a71 a71Var, boolean z10, int i10) {
        this.f33814a = i10;
        this.f33815b = a71Var;
        this.f33816c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33814a) {
            case 0:
                a71 a71Var = this.f33815b;
                x51 x51Var = a71Var.f32013h0;
                n51 n51Var = a71Var.f32015i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33816c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x51Var.setAlpha(f7);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n51Var.setAlpha(floatValue);
                n51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a71Var.f32017j0.setAlpha(n51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f33816c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a71 a71Var2 = this.f33815b;
                a71Var2.f32017j0.setAlpha(a71Var2.f32015i0.getAlpha() * floatValue2);
                return;
        }
    }
}
