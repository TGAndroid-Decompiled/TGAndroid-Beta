package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42314a;
    public final j4 f42315b;

    public p(j4 j4Var, int i10) {
        this.f42314a = i10;
        this.f42315b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42314a) {
            case 0:
                j4 j4Var = this.f42315b;
                j4Var.getClass();
                j4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4 j4Var2 = this.f42315b;
                j4Var2.Z0 = floatValue;
                j4Var2.f40442q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + j4Var2.f40441p0);
                return;
        }
    }
}
