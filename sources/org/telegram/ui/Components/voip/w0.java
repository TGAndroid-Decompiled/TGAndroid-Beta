package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32434a;
    public final b1 f32435b;

    public w0(b1 b1Var, int i10) {
        this.f32434a = i10;
        this.f32435b = b1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32434a) {
            case 0:
                b1 b1Var = this.f32435b;
                b1Var.getClass();
                b1Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                return;
            case 1:
                b1 b1Var2 = this.f32435b;
                b1Var2.getClass();
                b1Var2.f31975y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = b1Var2.F + AndroidUtilities.dp(28.0f);
                float dp2 = b1Var2.G + AndroidUtilities.dp(52.0f);
                float f10 = b1Var2.f31975y;
                b1Var2.D = dp - (dp * f10);
                b1Var2.E = dp2 - (f10 * dp2);
                b1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1 b1Var3 = this.f32435b;
                b1Var3.B = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = b1Var3.f31967c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * b1Var3.B));
                z0Var.requestLayout();
                return;
            default:
                b1 b1Var4 = this.f32435b;
                b1Var4.getClass();
                b1Var4.f31972s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var4.e();
                return;
        }
    }
}
