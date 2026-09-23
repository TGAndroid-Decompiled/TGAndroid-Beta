package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f36231a;
    public final i4 f36232b;

    public q(i4 i4Var, int i10) {
        this.f36231a = i10;
        this.f36232b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36231a) {
            case 0:
                i4 i4Var = this.f36232b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f36232b;
                i4Var2.Y0 = floatValue;
                i4Var2.f34017q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f34016p0);
                return;
        }
    }
}
