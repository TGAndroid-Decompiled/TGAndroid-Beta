package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f40326a;
    public final l4 f40327b;

    public q(l4 l4Var, int i10) {
        this.f40326a = i10;
        this.f40327b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40326a) {
            case 0:
                l4 l4Var = this.f40327b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f40327b;
                l4Var2.Y0 = floatValue;
                l4Var2.f38774q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.f38773p0);
                return;
        }
    }
}
