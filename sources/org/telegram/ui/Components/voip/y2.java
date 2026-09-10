package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28550a;
    public final z2 f28551b;

    public y2(z2 z2Var, int i10) {
        this.f28550a = i10;
        this.f28551b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28550a) {
            case 0:
                z2 z2Var = this.f28551b;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.d = intValue;
                z2Var.e = intValue;
                z2Var.f28562f = intValue;
                z2Var.h = intValue;
                z2Var.f28563n = intValue;
                z2Var.invalidate();
                return;
            default:
                z2 z2Var2 = this.f28551b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.d = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                z2Var2.e = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f28562f = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                z2Var2.h = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f28563n = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                z2Var2.f28564r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                z2Var2.f28565s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                z2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                z2Var2.f28566w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                z2Var2.f28567x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                z2Var2.invalidate();
                return;
        }
    }
}
