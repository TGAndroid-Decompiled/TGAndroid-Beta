package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36798a;
    public final j71 f36799b;
    public final boolean f36800c;

    public q51(j71 j71Var, boolean z10, int i10) {
        this.f36798a = i10;
        this.f36799b = j71Var;
        this.f36800c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36798a) {
            case 0:
                j71 j71Var = this.f36799b;
                g61 g61Var = j71Var.f34817h0;
                w51 w51Var = j71Var.f34819i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36800c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g61Var.setAlpha(f7);
                g61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                w51Var.setAlpha(floatValue);
                w51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                j71Var.f34821j0.setAlpha(w51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36800c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                j71 j71Var2 = this.f36799b;
                j71Var2.f34821j0.setAlpha(j71Var2.f34819i0.getAlpha() * floatValue2);
                return;
        }
    }
}
