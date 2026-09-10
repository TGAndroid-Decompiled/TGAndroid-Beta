package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28529a;
    public final c1 f28530b;

    public x0(c1 c1Var, int i10) {
        this.f28529a = i10;
        this.f28530b = c1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28529a) {
            case 0:
                c1 c1Var = this.f28530b;
                c1Var.getClass();
                c1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 1:
                c1 c1Var2 = this.f28530b;
                c1Var2.getClass();
                c1Var2.f28075y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = c1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = c1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = c1Var2.f28075y;
                c1Var2.G = dp - (dp * f7);
                c1Var2.H = dp2 - (f7 * dp2);
                c1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1 c1Var3 = this.f28530b;
                c1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                a1 a1Var = c1Var3.f28068c;
                a1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * c1Var3.E));
                a1Var.requestLayout();
                return;
            default:
                c1 c1Var4 = this.f28530b;
                c1Var4.getClass();
                c1Var4.f28072s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var4.e();
                return;
        }
    }
}
