package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31966a;
    public final x2 f31967b;

    public w2(x2 x2Var, int i10) {
        this.f31966a = i10;
        this.f31967b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31966a) {
            case 0:
                x2 x2Var = this.f31967b;
                x2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.d = intValue;
                x2Var.e = intValue;
                x2Var.f31980f = intValue;
                x2Var.h = intValue;
                x2Var.f31981n = intValue;
                x2Var.invalidate();
                return;
            default:
                x2 x2Var2 = this.f31967b;
                x2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.d = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(56.0f), floatValue);
                x2Var2.e = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31980f = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(60.0f), floatValue);
                x2Var2.h = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(36.0f), floatValue);
                x2Var2.f31981n = AndroidUtilities.lerp(x2Var2.F, AndroidUtilities.dp(64.0f), floatValue);
                x2Var2.f31982r = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), floatValue);
                x2Var2.f31983s = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), floatValue);
                x2Var2.v = AndroidUtilities.lerp(0, 0, floatValue);
                x2Var2.f31984w = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), floatValue);
                x2Var2.f31985x = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), floatValue);
                x2Var2.invalidate();
                return;
        }
    }
}
