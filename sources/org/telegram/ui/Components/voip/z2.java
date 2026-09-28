package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29702a;
    public final a3 f29703b;

    public z2(a3 a3Var, int i10) {
        this.f29702a = i10;
        this.f29703b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29702a) {
            case 0:
                a3 a3Var = this.f29703b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.e = intValue;
                a3Var.f29193f = intValue;
                a3Var.h = intValue;
                a3Var.f29194n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f29703b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.e = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f29193f = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f29194n = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f29195r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f29196s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f29197w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f29198x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
