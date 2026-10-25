package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33963a;
    public final p3 f33964b;

    public n3(p3 p3Var, int i10) {
        this.f33963a = i10;
        this.f33964b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33963a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f33964b;
                p3Var.f34013n = floatValue;
                p3Var.f34010k.invalidate();
                if (p3Var.f34013n > 1.0f && p3Var.f34017r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f34017r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f34017r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f34017r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f33964b;
                p3Var2.f34012m = intValue;
                p3Var2.f34010k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f33964b;
                if (p3Var3.f34008i <= p3Var3.f34014o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f34015p = intValue2;
                p3Var3.f34010k.invalidate();
                return;
        }
    }
}
