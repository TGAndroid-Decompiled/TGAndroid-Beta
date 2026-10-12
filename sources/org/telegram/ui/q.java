package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f39316a;
    public final k4 f39317b;

    public q(k4 k4Var, int i10) {
        this.f39316a = i10;
        this.f39317b = k4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39316a) {
            case 0:
                k4 k4Var = this.f39317b;
                k4Var.getClass();
                k4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4 k4Var2 = this.f39317b;
                k4Var2.Y0 = floatValue;
                k4Var2.f37553q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + k4Var2.f37552p0);
                return;
        }
    }
}
