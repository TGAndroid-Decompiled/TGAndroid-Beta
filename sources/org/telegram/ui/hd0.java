package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37039a;
    public final ug0 f37040b;

    public hd0(ug0 ug0Var, int i10) {
        this.f37039a = i10;
        this.f37040b = ug0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37039a) {
            case 0:
                ug0 ug0Var = this.f37040b;
                ug0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.f41197c.setAlpha(floatValue);
                ug0Var.f41197c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                ug0 ug0Var2 = this.f37040b;
                ug0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.f41197c.setAlpha(floatValue2);
                ug0Var2.f41197c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                ug0 ug0Var3 = this.f37040b;
                ug0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue3) + 0.1f;
                ug0Var3.V.setScaleX(f7);
                ug0Var3.V.setScaleY(f7);
                ug0Var3.V.setAlpha(floatValue3);
                return;
        }
    }
}
