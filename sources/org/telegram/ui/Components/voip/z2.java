package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32499a;
    public final a3 f32500b;

    public z2(a3 a3Var, int i10) {
        this.f32499a = i10;
        this.f32500b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32499a) {
            case 0:
                a3 a3Var = this.f32500b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.f31953e = intValue;
                a3Var.f31954f = intValue;
                a3Var.h = intValue;
                a3Var.f31955n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f32500b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.f31953e = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31954f = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31955n = AndroidUtilities.lerp(a3Var2.C, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f31956r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f31957s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f31958w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f31959x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
