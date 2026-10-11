package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40456a;
    public final j71 f40457b;
    public final boolean f40458c;

    public o51(j71 j71Var, boolean z10, int i10) {
        this.f40456a = i10;
        this.f40457b = j71Var;
        this.f40458c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40456a) {
            case 0:
                j71 j71Var = this.f40457b;
                g61 g61Var = j71Var.f38928h0;
                w51 w51Var = j71Var.f38930i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40458c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f38932j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40458c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f40457b;
                j71Var2.f38932j0.setAlpha(j71Var2.f38930i0.getAlpha() * floatValue2);
                return;
        }
    }
}
