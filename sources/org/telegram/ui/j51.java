package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37583a;
    public final c71 f37584b;
    public final boolean f37585c;

    public j51(c71 c71Var, boolean z10, int i10) {
        this.f37583a = i10;
        this.f37584b = c71Var;
        this.f37585c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37583a) {
            case 0:
                c71 c71Var = this.f37584b;
                z51 z51Var = c71Var.f35315h0;
                p51 p51Var = c71Var.f35317i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37585c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z51Var.setAlpha(f7);
                z51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p51Var.setAlpha(floatValue);
                p51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c71Var.f35319j0.setAlpha(p51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37585c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c71 c71Var2 = this.f37584b;
                c71Var2.f35319j0.setAlpha(c71Var2.f35317i0.getAlpha() * floatValue2);
                return;
        }
    }
}
