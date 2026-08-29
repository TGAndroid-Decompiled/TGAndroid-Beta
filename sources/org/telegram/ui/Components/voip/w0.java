package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34099a;
    public final b1 f34100b;

    public w0(b1 b1Var, int i10) {
        this.f34099a = i10;
        this.f34100b = b1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34099a) {
            case 0:
                b1 b1Var = this.f34100b;
                b1Var.getClass();
                b1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                b1 b1Var2 = this.f34100b;
                b1Var2.getClass();
                b1Var2.f33630y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = b1Var2.E + AndroidUtilities.dp(28.0f);
                float dp2 = b1Var2.F + AndroidUtilities.dp(52.0f);
                float f9 = b1Var2.f33630y;
                b1Var2.C = dp - (dp * f9);
                b1Var2.D = dp2 - (f9 * dp2);
                b1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1 b1Var3 = this.f34100b;
                b1Var3.A = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = b1Var3.f33622c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * b1Var3.A));
                z0Var.requestLayout();
                return;
            default:
                b1 b1Var4 = this.f34100b;
                b1Var4.getClass();
                b1Var4.f33627s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var4.e();
                return;
        }
    }
}
