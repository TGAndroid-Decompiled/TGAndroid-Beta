package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f40243a;
    public final l4 f40244b;

    public q(l4 l4Var, int i10) {
        this.f40243a = i10;
        this.f40244b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40243a) {
            case 0:
                l4 l4Var = this.f40244b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f40244b;
                l4Var2.Y0 = floatValue;
                l4Var2.f38721q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.f38720p0);
                return;
        }
    }
}
