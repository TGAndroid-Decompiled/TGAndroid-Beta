package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36899a;
    public final a71 f36900b;
    public final boolean f36901c;

    public h51(a71 a71Var, boolean z10, int i10) {
        this.f36899a = i10;
        this.f36900b = a71Var;
        this.f36901c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36899a) {
            case 0:
                a71 a71Var = this.f36900b;
                x51 x51Var = a71Var.f34739h0;
                n51 n51Var = a71Var.f34741i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36901c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                x51Var.setAlpha(f7);
                x51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                n51Var.setAlpha(floatValue);
                n51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                a71Var.f34743j0.setAlpha(n51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36901c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                a71 a71Var2 = this.f36900b;
                a71Var2.f34743j0.setAlpha(a71Var2.f34741i0.getAlpha() * floatValue2);
                return;
        }
    }
}
