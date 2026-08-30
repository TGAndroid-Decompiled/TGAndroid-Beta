package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29989a;
    public final a1 f29990b;

    public v0(a1 a1Var, int i10) {
        this.f29989a = i10;
        this.f29990b = a1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29989a) {
            case 0:
                a1 a1Var = this.f29990b;
                a1Var.getClass();
                a1Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.invalidate();
                return;
            case 1:
                a1 a1Var2 = this.f29990b;
                a1Var2.getClass();
                a1Var2.f29562y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = a1Var2.F + AndroidUtilities.dp(28.0f);
                float dp2 = a1Var2.G + AndroidUtilities.dp(52.0f);
                float f10 = a1Var2.f29562y;
                a1Var2.D = dp - (dp * f10);
                a1Var2.E = dp2 - (f10 * dp2);
                a1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1 a1Var3 = this.f29990b;
                a1Var3.B = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                y0 y0Var = a1Var3.f29555c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * a1Var3.B));
                y0Var.requestLayout();
                return;
            default:
                a1 a1Var4 = this.f29990b;
                a1Var4.getClass();
                a1Var4.f29559s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var4.e();
                return;
        }
    }
}
