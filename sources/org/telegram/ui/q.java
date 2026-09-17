package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f39659a;
    public final i4 f39660b;

    public q(i4 i4Var, int i10) {
        this.f39659a = i10;
        this.f39660b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39659a) {
            case 0:
                i4 i4Var = this.f39660b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f39660b;
                i4Var2.Y0 = floatValue;
                i4Var2.f37229q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f37228p0);
                return;
        }
    }
}
