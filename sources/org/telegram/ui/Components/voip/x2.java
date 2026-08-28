package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33940a;
    public final y2 f33941b;

    public x2(y2 y2Var, int i9) {
        this.f33940a = i9;
        this.f33941b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33940a) {
            case 0:
                y2 y2Var = this.f33941b;
                y2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.d = intValue;
                y2Var.f33957e = intValue;
                y2Var.f33958f = intValue;
                y2Var.h = intValue;
                y2Var.f33959n = intValue;
                y2Var.invalidate();
                return;
            default:
                y2 y2Var2 = this.f33941b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.d = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(56.0f), floatValue);
                y2Var2.f33957e = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.f33958f = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(60.0f), floatValue);
                y2Var2.h = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.f33959n = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(64.0f), floatValue);
                y2Var2.f33960r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                y2Var2.f33961s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                y2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                y2Var2.f33962w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                y2Var2.f33963x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                y2Var2.invalidate();
                return;
        }
    }
}
