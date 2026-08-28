package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41756a;
    public final fg0 f41757b;

    public qc0(fg0 fg0Var, int i9) {
        this.f41756a = i9;
        this.f41757b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41756a) {
            case 0:
                fg0 fg0Var = this.f41757b;
                fg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.f38263c.setAlpha(floatValue);
                fg0Var.f38263c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                fg0 fg0Var2 = this.f41757b;
                fg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.f38263c.setAlpha(floatValue2);
                fg0Var2.f38263c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                fg0 fg0Var3 = this.f41757b;
                fg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                fg0Var3.R.setScaleX(f10);
                fg0Var3.R.setScaleY(f10);
                fg0Var3.R.setAlpha(floatValue3);
                return;
        }
    }
}
