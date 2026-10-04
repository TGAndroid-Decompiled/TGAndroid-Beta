package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32328a;
    public final a3 f32329b;

    public z2(a3 a3Var, int i10) {
        this.f32328a = i10;
        this.f32329b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32328a) {
            case 0:
                a3 a3Var = this.f32329b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.f31778e = intValue;
                a3Var.f31779f = intValue;
                a3Var.h = intValue;
                a3Var.f31780n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f32329b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.f31778e = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31779f = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f31780n = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f31781r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f31782s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f31783w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f31784x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
