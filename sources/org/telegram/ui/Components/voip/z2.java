package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32504a;
    public final a3 f32505b;

    public z2(a3 a3Var, int i10) {
        this.f32504a = i10;
        this.f32505b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32504a) {
            case 0:
                a3 a3Var = this.f32505b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.f31958e = intValue;
                a3Var.f31959f = intValue;
                a3Var.h = intValue;
                a3Var.f31960n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f32505b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.f31958e = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31959f = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31960n = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f31961r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f31962s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f31963w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f31964x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
