package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29772a;
    public final z2 f29773b;

    public y2(z2 z2Var, int i10) {
        this.f29772a = i10;
        this.f29773b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29772a) {
            case 0:
                z2 z2Var = this.f29773b;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.d = intValue;
                z2Var.e = intValue;
                z2Var.f29786f = intValue;
                z2Var.h = intValue;
                z2Var.f29787n = intValue;
                z2Var.invalidate();
                return;
            default:
                z2 z2Var2 = this.f29773b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.d = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                z2Var2.e = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f29786f = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                z2Var2.h = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                z2Var2.f29787n = AndroidUtilities.lerp(z2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                z2Var2.f29788r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                z2Var2.f29789s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                z2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                z2Var2.f29790w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                z2Var2.f29791x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                z2Var2.invalidate();
                return;
        }
    }
}
