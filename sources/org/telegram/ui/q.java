package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f39658a;
    public final i4 f39659b;

    public q(i4 i4Var, int i10) {
        this.f39658a = i10;
        this.f39659b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39658a) {
            case 0:
                i4 i4Var = this.f39659b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f39659b;
                i4Var2.Y0 = floatValue;
                i4Var2.f37228q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f37227p0);
                return;
        }
    }
}
