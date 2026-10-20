package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31810a;
    public final x2 f31811b;

    public w2(x2 x2Var, int i10) {
        this.f31810a = i10;
        this.f31811b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31810a) {
            case 0:
                x2 x2Var = this.f31811b;
                x2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.d = intValue;
                x2Var.e = intValue;
                x2Var.f31824f = intValue;
                x2Var.h = intValue;
                x2Var.f31825n = intValue;
                x2Var.invalidate();
                return;
            default:
                x2 x2Var2 = this.f31811b;
                x2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.d = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                x2Var2.e = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31824f = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                x2Var2.h = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31825n = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                x2Var2.f31826r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                x2Var2.f31827s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                x2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                x2Var2.f31828w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                x2Var2.f31829x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                x2Var2.invalidate();
                return;
        }
    }
}
