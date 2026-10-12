package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31844a;
    public final p3 f31845b;

    public n3(p3 p3Var, int i10) {
        this.f31844a = i10;
        this.f31845b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31844a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f31845b;
                p3Var.f31878n = floatValue;
                p3Var.f31875k.invalidate();
                if (p3Var.f31878n > 1.0f && p3Var.f31882r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f31882r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f31882r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f31882r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f31845b;
                p3Var2.f31877m = intValue;
                p3Var2.f31875k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f31845b;
                if (p3Var3.f31873i <= p3Var3.f31879o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f31880p = intValue2;
                p3Var3.f31875k.invalidate();
                return;
        }
    }
}
