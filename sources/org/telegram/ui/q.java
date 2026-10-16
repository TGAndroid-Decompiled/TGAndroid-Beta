package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f39037a;
    public final k4 f39038b;

    public q(k4 k4Var, int i10) {
        this.f39037a = i10;
        this.f39038b = k4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39037a) {
            case 0:
                k4 k4Var = this.f39038b;
                k4Var.getClass();
                k4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4 k4Var2 = this.f39038b;
                k4Var2.Y0 = floatValue;
                k4Var2.f37274q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + k4Var2.f37273p0);
                return;
        }
    }
}
