package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37588a;
    public final c71 f37589b;
    public final boolean f37590c;

    public j51(c71 c71Var, boolean z10, int i10) {
        this.f37588a = i10;
        this.f37589b = c71Var;
        this.f37590c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37588a) {
            case 0:
                c71 c71Var = this.f37589b;
                z51 z51Var = c71Var.f35320h0;
                p51 p51Var = c71Var.f35322i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37590c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z51Var.setAlpha(f7);
                z51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p51Var.setAlpha(floatValue);
                p51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c71Var.f35324j0.setAlpha(p51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37590c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c71 c71Var2 = this.f37589b;
                c71Var2.f35324j0.setAlpha(c71Var2.f35322i0.getAlpha() * floatValue2);
                return;
        }
    }
}
