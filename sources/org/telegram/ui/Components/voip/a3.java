package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33614a;
    public final b3 f33615b;

    public a3(b3 b3Var, int i10) {
        this.f33614a = i10;
        this.f33615b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33614a) {
            case 0:
                b3 b3Var = this.f33615b;
                b3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3Var.d = intValue;
                b3Var.f33637e = intValue;
                b3Var.f33638f = intValue;
                b3Var.h = intValue;
                b3Var.f33639n = intValue;
                b3Var.invalidate();
                return;
            default:
                b3 b3Var2 = this.f33615b;
                b3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.d = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(56.0f), floatValue);
                b3Var2.f33637e = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                b3Var2.f33638f = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(60.0f), floatValue);
                b3Var2.h = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(36.0f), floatValue);
                b3Var2.f33639n = AndroidUtilities.lerp(b3Var2.B, AndroidUtilities.dp(64.0f), floatValue);
                b3Var2.f33640r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                b3Var2.f33641s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                b3Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                b3Var2.f33642w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                b3Var2.f33643x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                b3Var2.invalidate();
                return;
        }
    }
}
