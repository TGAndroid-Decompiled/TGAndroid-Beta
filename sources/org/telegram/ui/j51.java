package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37582a;
    public final c71 f37583b;
    public final boolean f37584c;

    public j51(c71 c71Var, boolean z10, int i10) {
        this.f37582a = i10;
        this.f37583b = c71Var;
        this.f37584c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37582a) {
            case 0:
                c71 c71Var = this.f37583b;
                z51 z51Var = c71Var.f35314h0;
                p51 p51Var = c71Var.f35316i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37584c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z51Var.setAlpha(f7);
                z51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p51Var.setAlpha(floatValue);
                p51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c71Var.f35318j0.setAlpha(p51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f37584c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c71 c71Var2 = this.f37583b;
                c71Var2.f35318j0.setAlpha(c71Var2.f35316i0.getAlpha() * floatValue2);
                return;
        }
    }
}
