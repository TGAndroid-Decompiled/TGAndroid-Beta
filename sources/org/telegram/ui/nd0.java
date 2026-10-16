package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38366a;
    public final ah0 f38367b;

    public nd0(ah0 ah0Var, int i10) {
        this.f38366a = i10;
        this.f38367b = ah0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38366a) {
            case 0:
                ah0 ah0Var = this.f38367b;
                ah0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.f33909c.setAlpha(floatValue);
                ah0Var.f33909c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                ah0 ah0Var2 = this.f38367b;
                ah0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                ah0Var2.V.setScaleX(f7);
                ah0Var2.V.setScaleY(f7);
                ah0Var2.V.setAlpha(floatValue2);
                return;
            default:
                ah0 ah0Var3 = this.f38367b;
                ah0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var3.f33909c.setAlpha(floatValue3);
                ah0Var3.f33909c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
