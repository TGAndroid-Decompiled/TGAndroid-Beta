package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36537a;
    public final i71 f36538b;
    public final boolean f36539c;

    public p51(i71 i71Var, boolean z10, int i10) {
        this.f36537a = i10;
        this.f36538b = i71Var;
        this.f36539c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36537a) {
            case 0:
                i71 i71Var = this.f36538b;
                f61 f61Var = i71Var.f34461h0;
                v51 v51Var = i71Var.f34463i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36539c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                f61Var.setAlpha(f7);
                f61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                v51Var.setAlpha(floatValue);
                v51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                i71Var.f34465j0.setAlpha(v51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36539c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                i71 i71Var2 = this.f36538b;
                i71Var2.f34465j0.setAlpha(i71Var2.f34463i0.getAlpha() * floatValue2);
                return;
        }
    }
}
