package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40422a;
    public final j71 f40423b;
    public final boolean f40424c;

    public o51(j71 j71Var, boolean z10, int i10) {
        this.f40422a = i10;
        this.f40423b = j71Var;
        this.f40424c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40422a) {
            case 0:
                j71 j71Var = this.f40423b;
                g61 g61Var = j71Var.f38894h0;
                w51 w51Var = j71Var.f38896i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40424c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f38898j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40424c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f40423b;
                j71Var2.f38898j0.setAlpha(j71Var2.f38896i0.getAlpha() * floatValue2);
                return;
        }
    }
}
