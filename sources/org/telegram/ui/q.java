package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f39685a;
    public final i4 f39686b;

    public q(i4 i4Var, int i10) {
        this.f39685a = i10;
        this.f39686b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39685a) {
            case 0:
                i4 i4Var = this.f39686b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f39686b;
                i4Var2.Y0 = floatValue;
                i4Var2.f37255q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f37254p0);
                return;
        }
    }
}
