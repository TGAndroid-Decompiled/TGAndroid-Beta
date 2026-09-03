package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35358a;
    public final w61 f35359b;
    public final boolean f35360c;

    public b51(w61 w61Var, boolean z4, int i10) {
        this.f35358a = i10;
        this.f35359b = w61Var;
        this.f35360c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35358a) {
            case 0:
                w61 w61Var = this.f35359b;
                t51 t51Var = w61Var.f42314e0;
                i51 i51Var = w61Var.f42317f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35360c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                t51Var.setAlpha(f10);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                i51Var.setAlpha(floatValue);
                i51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                w61Var.f42319g0.setAlpha(i51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35360c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                w61 w61Var2 = this.f35359b;
                w61Var2.f42319g0.setAlpha(w61Var2.f42317f0.getAlpha() * floatValue2);
                return;
        }
    }
}
