package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40657a;
    public final f61 f40658b;
    public final boolean f40659c;

    public k41(f61 f61Var, boolean z10, int i10) {
        this.f40657a = i10;
        this.f40658b = f61Var;
        this.f40659c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40657a) {
            case 0:
                f61 f61Var = this.f40658b;
                c51 c51Var = f61Var.f39202h0;
                s41 s41Var = f61Var.f39204i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40659c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                c51Var.setAlpha(f7);
                c51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                s41Var.setAlpha(floatValue);
                s41Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                f61Var.f39206j0.setAlpha(s41Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40659c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                f61 f61Var2 = this.f40658b;
                f61Var2.f39206j0.setAlpha(f61Var2.f39204i0.getAlpha() * floatValue2);
                return;
        }
    }
}
