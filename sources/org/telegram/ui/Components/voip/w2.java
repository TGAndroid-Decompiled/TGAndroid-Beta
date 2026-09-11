package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31917a;
    public final x2 f31918b;

    public w2(x2 x2Var, int i10) {
        this.f31917a = i10;
        this.f31918b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31917a) {
            case 0:
                x2 x2Var = this.f31918b;
                x2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.d = intValue;
                x2Var.f31932e = intValue;
                x2Var.f31933f = intValue;
                x2Var.h = intValue;
                x2Var.f31934n = intValue;
                x2Var.invalidate();
                return;
            default:
                x2 x2Var2 = this.f31918b;
                x2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.d = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                x2Var2.f31932e = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31933f = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                x2Var2.h = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31934n = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                x2Var2.f31935r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                x2Var2.f31936s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                x2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                x2Var2.f31937w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                x2Var2.f31938x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                x2Var2.invalidate();
                return;
        }
    }
}
