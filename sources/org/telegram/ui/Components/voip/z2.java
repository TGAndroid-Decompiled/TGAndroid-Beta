package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34342a;
    public final a3 f34343b;

    public z2(a3 a3Var, int i10) {
        this.f34342a = i10;
        this.f34343b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34342a) {
            case 0:
                a3 a3Var = this.f34343b;
                a3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.d = intValue;
                a3Var.e = intValue;
                a3Var.f33828f = intValue;
                a3Var.h = intValue;
                a3Var.f33829n = intValue;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f34343b;
                a3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.d = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                a3Var2.e = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f33828f = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                a3Var2.h = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                a3Var2.f33829n = AndroidUtilities.lerp(a3Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                a3Var2.f33830r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                a3Var2.f33831s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                a3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                a3Var2.f33832w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                a3Var2.f33833x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                a3Var2.invalidate();
                return;
        }
    }
}
