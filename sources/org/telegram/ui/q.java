package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f36750a;
    public final h4 f36751b;

    public q(h4 h4Var, int i10) {
        this.f36750a = i10;
        this.f36751b = h4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36750a) {
            case 0:
                h4 h4Var = this.f36751b;
                h4Var.getClass();
                h4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4 h4Var2 = this.f36751b;
                h4Var2.Y0 = floatValue;
                h4Var2.f34126q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + h4Var2.f34125p0);
                return;
        }
    }
}
