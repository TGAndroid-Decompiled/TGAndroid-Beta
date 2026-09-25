package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29761a;
    public final d1 f29762b;

    public y0(d1 d1Var, int i10) {
        this.f29761a = i10;
        this.f29762b = d1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29761a) {
            case 0:
                d1 d1Var = this.f29762b;
                d1Var.getClass();
                d1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 1:
                d1 d1Var2 = this.f29762b;
                d1Var2.getClass();
                d1Var2.f29311y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = d1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = d1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = d1Var2.f29311y;
                d1Var2.G = dp - (dp * f7);
                d1Var2.H = dp2 - (f7 * dp2);
                d1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1 d1Var3 = this.f29762b;
                d1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = d1Var3.f29304c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * d1Var3.E));
                b1Var.requestLayout();
                return;
            default:
                d1 d1Var4 = this.f29762b;
                d1Var4.getClass();
                d1Var4.f29308s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var4.e();
                return;
        }
    }
}
