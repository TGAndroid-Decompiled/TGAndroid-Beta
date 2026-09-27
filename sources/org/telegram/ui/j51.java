package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34638a;
    public final c71 f34639b;
    public final boolean f34640c;

    public j51(c71 c71Var, boolean z10, int i10) {
        this.f34638a = i10;
        this.f34639b = c71Var;
        this.f34640c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34638a) {
            case 0:
                c71 c71Var = this.f34639b;
                z51 z51Var = c71Var.f32585h0;
                p51 p51Var = c71Var.f32587i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f34640c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                z51Var.setAlpha(f7);
                z51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                p51Var.setAlpha(floatValue);
                p51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                c71Var.f32589j0.setAlpha(p51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f34640c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                c71 c71Var2 = this.f34639b;
                c71Var2.f32589j0.setAlpha(c71Var2.f32587i0.getAlpha() * floatValue2);
                return;
        }
    }
}
