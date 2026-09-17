package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31945a;
    public final x2 f31946b;

    public w2(x2 x2Var, int i10) {
        this.f31945a = i10;
        this.f31946b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31945a) {
            case 0:
                x2 x2Var = this.f31946b;
                x2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.d = intValue;
                x2Var.f31960e = intValue;
                x2Var.f31961f = intValue;
                x2Var.h = intValue;
                x2Var.f31962n = intValue;
                x2Var.invalidate();
                return;
            default:
                x2 x2Var2 = this.f31946b;
                x2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.d = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                x2Var2.f31960e = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31961f = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                x2Var2.h = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31962n = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                x2Var2.f31963r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                x2Var2.f31964s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                x2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                x2Var2.f31965w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                x2Var2.f31966x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                x2Var2.invalidate();
                return;
        }
    }
}
