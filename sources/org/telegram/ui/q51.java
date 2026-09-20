package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36775a;
    public final j71 f36776b;
    public final boolean f36777c;

    public q51(j71 j71Var, boolean z10, int i10) {
        this.f36775a = i10;
        this.f36776b = j71Var;
        this.f36777c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36775a) {
            case 0:
                j71 j71Var = this.f36776b;
                g61 g61Var = j71Var.f34792h0;
                w51 w51Var = j71Var.f34794i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36777c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f34796j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36777c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f36776b;
                j71Var2.f34796j0.setAlpha(j71Var2.f34794i0.getAlpha() * floatValue2);
                return;
        }
    }
}
