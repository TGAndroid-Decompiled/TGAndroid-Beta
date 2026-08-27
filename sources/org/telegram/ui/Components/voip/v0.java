package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class v0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33948a;

    public final a1 f33949b;

    public v0(a1 a1Var, int i10) {
        this.f33948a = i10;
        this.f33949b = a1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33948a) {
            case 0:
                a1 a1Var = this.f33949b;
                a1Var.getClass();
                a1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.invalidate();
                break;
            case 1:
                a1 a1Var2 = this.f33949b;
                a1Var2.getClass();
                a1Var2.f33485y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fDp = a1Var2.E + AndroidUtilities.dp(28.0f);
                float fDp2 = a1Var2.F + AndroidUtilities.dp(52.0f);
                float f10 = a1Var2.f33485y;
                a1Var2.C = fDp - (fDp * f10);
                a1Var2.D = fDp2 - (f10 * fDp2);
                a1Var2.invalidate();
                break;
            case 2:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1 a1Var3 = this.f33949b;
                a1Var3.A = fFloatValue;
                int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                y0 y0Var = a1Var3.f33477c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (iDp * a1Var3.A));
                y0Var.requestLayout();
                break;
            default:
                a1 a1Var4 = this.f33949b;
                a1Var4.getClass();
                a1Var4.f33482s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var4.e();
                break;
        }
    }
}
