package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32440a;
    public final e1 f32441b;

    public z0(e1 e1Var, int i10) {
        this.f32440a = i10;
        this.f32441b = e1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32440a) {
            case 0:
                e1 e1Var = this.f32441b;
                e1Var.getClass();
                e1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.invalidate();
                return;
            case 1:
                e1 e1Var2 = this.f32441b;
                e1Var2.getClass();
                e1Var2.f31968y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = e1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = e1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = e1Var2.f31968y;
                e1Var2.G = dp - (dp * f7);
                e1Var2.H = dp2 - (f7 * dp2);
                e1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1 e1Var3 = this.f32441b;
                e1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                c1 c1Var = e1Var3.f31960c;
                c1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * e1Var3.E));
                c1Var.requestLayout();
                return;
            default:
                e1 e1Var4 = this.f32441b;
                e1Var4.getClass();
                e1Var4.f31965s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var4.e();
                return;
        }
    }
}
