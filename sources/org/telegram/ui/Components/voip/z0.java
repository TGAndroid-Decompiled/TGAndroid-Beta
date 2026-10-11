package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32504a;
    public final e1 f32505b;

    public z0(e1 e1Var, int i10) {
        this.f32504a = i10;
        this.f32505b = e1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32504a) {
            case 0:
                e1 e1Var = this.f32505b;
                e1Var.getClass();
                e1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.invalidate();
                return;
            case 1:
                e1 e1Var2 = this.f32505b;
                e1Var2.getClass();
                e1Var2.f32032y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = e1Var2.I + AndroidUtilities.dp(28.0f);
                float dp2 = e1Var2.J + AndroidUtilities.dp(52.0f);
                float f7 = e1Var2.f32032y;
                e1Var2.G = dp - (dp * f7);
                e1Var2.H = dp2 - (f7 * dp2);
                e1Var2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1 e1Var3 = this.f32505b;
                e1Var3.E = floatValue;
                int dp3 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                c1 c1Var = e1Var3.f32024c;
                c1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp3 * e1Var3.E));
                c1Var.requestLayout();
                return;
            default:
                e1 e1Var4 = this.f32505b;
                e1Var4.getClass();
                e1Var4.f32029s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var4.e();
                return;
        }
    }
}
