package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class x2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33990a;

    public final y2 f33991b;

    public x2(y2 y2Var, int i10) {
        this.f33990a = i10;
        this.f33991b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33990a) {
            case 0:
                y2 y2Var = this.f33991b;
                y2Var.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.d = iIntValue;
                y2Var.f34007e = iIntValue;
                y2Var.f34008f = iIntValue;
                y2Var.h = iIntValue;
                y2Var.f34009n = iIntValue;
                y2Var.invalidate();
                break;
            default:
                y2 y2Var2 = this.f33991b;
                y2Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.d = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(56.0f), fFloatValue);
                y2Var2.f34007e = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), fFloatValue);
                y2Var2.f34008f = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(60.0f), fFloatValue);
                y2Var2.h = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(36.0f), fFloatValue);
                y2Var2.f34009n = AndroidUtilities.lerp(y2Var2.B, AndroidUtilities.dp(64.0f), fFloatValue);
                y2Var2.f34010r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), fFloatValue);
                y2Var2.f34011s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), fFloatValue);
                y2Var2.v = AndroidUtilities.lerp(0, 0, fFloatValue);
                y2Var2.f34012w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), fFloatValue);
                y2Var2.f34013x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), fFloatValue);
                y2Var2.invalidate();
                break;
        }
    }
}
