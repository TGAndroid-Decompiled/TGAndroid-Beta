package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ed0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32893a;
    public final rg0 f32894b;

    public ed0(rg0 rg0Var, int i10) {
        this.f32893a = i10;
        this.f32894b = rg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32893a) {
            case 0:
                rg0 rg0Var = this.f32894b;
                rg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rg0Var.f36822c.setAlpha(floatValue);
                rg0Var.f36822c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                rg0 rg0Var2 = this.f32894b;
                rg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rg0Var2.f36822c.setAlpha(floatValue2);
                rg0Var2.f36822c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                rg0 rg0Var3 = this.f32894b;
                rg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                rg0Var3.V.setScaleX(f7);
                rg0Var3.V.setScaleY(f7);
                rg0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
