package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30047a;
    public final z2 f30048b;

    public y2(z2 z2Var, int i10) {
        this.f30047a = i10;
        this.f30048b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30047a) {
            case 0:
                z2 z2Var = this.f30048b;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.d = intValue;
                z2Var.e = intValue;
                z2Var.f30056f = intValue;
                z2Var.h = intValue;
                z2Var.f30057n = intValue;
                z2Var.invalidate();
                return;
            default:
                z2 z2Var2 = this.f30048b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.d = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(56.0f), floatValue);
                z2Var2.e = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f30056f = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(60.0f), floatValue);
                z2Var2.h = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f30057n = AndroidUtilities.lerp(z2Var2.C, AndroidUtilities.dp(64.0f), floatValue);
                z2Var2.f30058r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                z2Var2.f30059s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                z2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                z2Var2.f30060w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                z2Var2.f30061x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                z2Var2.invalidate();
                return;
        }
    }
}
