package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39435a;
    public final j71 f39436b;
    public final boolean f39437c;

    public p51(j71 j71Var, boolean z10, int i10) {
        this.f39435a = i10;
        this.f39436b = j71Var;
        this.f39437c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39435a) {
            case 0:
                j71 j71Var = this.f39436b;
                g61 g61Var = j71Var.f37674h0;
                w51 w51Var = j71Var.f37676i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39437c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f37678j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39437c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f39436b;
                j71Var2.f37678j0.setAlpha(j71Var2.f37676i0.getAlpha() * floatValue2);
                return;
        }
    }
}
