package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f40320a;
    public final l4 f40321b;

    public q(l4 l4Var, int i10) {
        this.f40320a = i10;
        this.f40321b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40320a) {
            case 0:
                l4 l4Var = this.f40321b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f40321b;
                l4Var2.Y0 = floatValue;
                l4Var2.f38768q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.f38767p0);
                return;
        }
    }
}
