package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33966a;
    public final p3 f33967b;

    public n3(p3 p3Var, int i10) {
        this.f33966a = i10;
        this.f33967b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33966a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f33967b;
                p3Var.f34016n = floatValue;
                p3Var.f34013k.invalidate();
                if (p3Var.f34016n > 1.0f && p3Var.f34020r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f34020r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f34020r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f34020r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f33967b;
                p3Var2.f34015m = intValue;
                p3Var2.f34013k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f33967b;
                if (p3Var3.f34011i <= p3Var3.f34017o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f34018p = intValue2;
                p3Var3.f34013k.invalidate();
                return;
        }
    }
}
