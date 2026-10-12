package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31859a;
    public final p3 f31860b;

    public n3(p3 p3Var, int i10) {
        this.f31859a = i10;
        this.f31860b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31859a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f31860b;
                p3Var.f31902n = floatValue;
                p3Var.f31899k.invalidate();
                if (p3Var.f31902n > 1.0f && p3Var.f31906r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f31906r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f31906r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f31906r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f31860b;
                p3Var2.f31901m = intValue;
                p3Var2.f31899k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f31860b;
                if (p3Var3.f31897i <= p3Var3.f31903o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f31904p = intValue2;
                p3Var3.f31899k.invalidate();
                return;
        }
    }
}
