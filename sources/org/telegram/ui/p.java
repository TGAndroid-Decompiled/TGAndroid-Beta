package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f40315a;
    public final k4 f40316b;

    public p(k4 k4Var, int i10) {
        this.f40315a = i10;
        this.f40316b = k4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40315a) {
            case 0:
                k4 k4Var = this.f40316b;
                k4Var.getClass();
                k4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4 k4Var2 = this.f40316b;
                k4Var2.Z0 = floatValue;
                k4Var2.f38801q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + k4Var2.f38800p0);
                return;
        }
    }
}
