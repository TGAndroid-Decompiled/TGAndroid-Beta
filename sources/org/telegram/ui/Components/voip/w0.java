package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31934a;
    public final b1 f31935b;

    public w0(b1 b1Var, int i10) {
        this.f31934a = i10;
        this.f31935b = b1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31934a) {
            case 0:
                b1 b1Var = this.f31935b;
                b1Var.getClass();
                b1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                b1 b1Var2 = this.f31935b;
                b1Var2.getClass();
                b1Var2.f31451y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = b1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = b1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = b1Var2.f31451y;
                b1Var2.G = dp - (dp * f7);
                b1Var2.H = dp2 - (f7 * dp2);
                b1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1 b1Var3 = this.f31935b;
                b1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = b1Var3.f31443c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * b1Var3.E));
                z0Var.requestLayout();
                return;
            default:
                b1 b1Var4 = this.f31935b;
                b1Var4.getClass();
                b1Var4.f31448s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var4.e();
                return;
        }
    }
}
