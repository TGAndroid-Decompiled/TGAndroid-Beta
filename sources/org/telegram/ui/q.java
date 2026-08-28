package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f41631a;
    public final l4 f41632b;

    public q(l4 l4Var, int i9) {
        this.f41631a = i9;
        this.f41632b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41631a) {
            case 0:
                l4 l4Var = this.f41632b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f41632b;
                l4Var2.U0 = floatValue;
                l4Var2.m0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.f40022l0);
                return;
        }
    }
}
