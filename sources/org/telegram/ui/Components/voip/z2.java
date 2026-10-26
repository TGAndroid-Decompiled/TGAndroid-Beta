package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34237a;
    public final a3 f34238b;

    public z2(a3 a3Var, int i10) {
        this.f34237a = i10;
        this.f34238b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34237a) {
            case 0:
                a3 a3Var = this.f34238b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.e = intValue;
                a3Var.f33723f = intValue;
                a3Var.h = intValue;
                a3Var.f33724n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f34238b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.e = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f33723f = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f33724n = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f33725r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f33726s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f33727w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f33728x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
