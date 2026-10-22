package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f40329a;
    public final l4 f40330b;

    public q(l4 l4Var, int i10) {
        this.f40329a = i10;
        this.f40330b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40329a) {
            case 0:
                l4 l4Var = this.f40330b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f40330b;
                l4Var2.Y0 = floatValue;
                l4Var2.f38778q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.f38777p0);
                return;
        }
    }
}
