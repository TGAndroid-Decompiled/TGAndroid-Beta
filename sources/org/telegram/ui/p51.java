package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39408a;
    public final j71 f39409b;
    public final boolean f39410c;

    public p51(j71 j71Var, boolean z10, int i10) {
        this.f39408a = i10;
        this.f39409b = j71Var;
        this.f39410c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39408a) {
            case 0:
                j71 j71Var = this.f39409b;
                g61 g61Var = j71Var.f37647h0;
                w51 w51Var = j71Var.f37649i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39410c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f37651j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39410c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f39409b;
                j71Var2.f37651j0.setAlpha(j71Var2.f37649i0.getAlpha() * floatValue2);
                return;
        }
    }
}
