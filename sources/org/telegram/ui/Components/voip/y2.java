package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32391a;
    public final z2 f32392b;

    public y2(z2 z2Var, int i10) {
        this.f32391a = i10;
        this.f32392b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32391a) {
            case 0:
                z2 z2Var = this.f32392b;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.d = intValue;
                z2Var.f32406e = intValue;
                z2Var.f32407f = intValue;
                z2Var.h = intValue;
                z2Var.f32408n = intValue;
                z2Var.invalidate();
                return;
            default:
                z2 z2Var2 = this.f32392b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.d = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                z2Var2.f32406e = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f32407f = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                z2Var2.h = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f32408n = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                z2Var2.f32409r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                z2Var2.f32410s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                z2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                z2Var2.f32411w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                z2Var2.f32412x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                z2Var2.invalidate();
                return;
        }
    }
}
