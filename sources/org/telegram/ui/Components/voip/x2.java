package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30590a;
    public final y2 f30591b;

    public x2(y2 y2Var, int i10) {
        this.f30590a = i10;
        this.f30591b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30590a) {
            case 0:
                y2 y2Var = this.f30591b;
                y2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.d = intValue;
                y2Var.e = intValue;
                y2Var.f30602f = intValue;
                y2Var.h = intValue;
                y2Var.f30603n = intValue;
                y2Var.invalidate();
                return;
            default:
                y2 y2Var2 = this.f30591b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.d = AndroidUtilities.lerp(y2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                y2Var2.e = AndroidUtilities.lerp(y2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.f30602f = AndroidUtilities.lerp(y2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                y2Var2.h = AndroidUtilities.lerp(y2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                y2Var2.f30603n = AndroidUtilities.lerp(y2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                y2Var2.f30604r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                y2Var2.f30605s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                y2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                y2Var2.f30606w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                y2Var2.f30607x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                y2Var2.invalidate();
                return;
        }
    }
}
