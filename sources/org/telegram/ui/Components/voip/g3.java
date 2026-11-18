package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40884a;
    public final i3 f40885b;

    public g3(i3 i3Var, int i7) {
        this.f40884a = i7;
        this.f40885b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40884a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3 i3Var = this.f40885b;
                i3Var.f40940n = floatValue;
                i3Var.f40937k.invalidate();
                if (i3Var.f40940n > 1.0f && i3Var.f40944r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    i3Var.f40944r = ofInt;
                    ofInt.addUpdateListener(new g3(i3Var, 2));
                    i3Var.f40944r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    i3Var.f40944r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var2 = this.f40885b;
                i3Var2.f40939m = intValue;
                i3Var2.f40937k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var3 = this.f40885b;
                if (i3Var3.f40935i <= i3Var3.f40941o / 2) {
                    intValue2 = -intValue2;
                }
                i3Var3.f40942p = intValue2;
                i3Var3.f40937k.invalidate();
                return;
        }
    }
}
