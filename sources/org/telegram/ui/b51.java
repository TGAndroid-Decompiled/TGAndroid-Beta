package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32741a;
    public final x61 f32742b;
    public final boolean f32743c;

    public b51(x61 x61Var, boolean z4, int i10) {
        this.f32741a = i10;
        this.f32742b = x61Var;
        this.f32743c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32741a) {
            case 0:
                x61 x61Var = this.f32742b;
                t51 t51Var = x61Var.f39862e0;
                i51 i51Var = x61Var.f39865f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f32743c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                t51Var.setAlpha(f10);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                i51Var.setAlpha(floatValue);
                i51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                x61Var.f39867g0.setAlpha(i51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f32743c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                x61 x61Var2 = this.f32742b;
                x61Var2.f39867g0.setAlpha(x61Var2.f39865f0.getAlpha() * floatValue2);
                return;
        }
    }
}
