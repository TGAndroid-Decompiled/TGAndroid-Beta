package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31676a;
    public final v2 f31677b;

    public t2(v2 v2Var, int i10) {
        this.f31676a = i10;
        this.f31677b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31676a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var = this.f31677b;
                v2Var.f31705n = floatValue;
                v2Var.f31702k.invalidate();
                if (v2Var.f31705n > 1.0f && v2Var.f31709r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.i0.L(12), 0);
                    v2Var.f31709r = ofInt;
                    ofInt.addUpdateListener(new t2(v2Var, 2));
                    v2Var.f31709r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    v2Var.f31709r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var2 = this.f31677b;
                v2Var2.f31704m = intValue;
                v2Var2.f31702k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var3 = this.f31677b;
                if (v2Var3.f31700i <= v2Var3.f31706o / 2) {
                    intValue2 = -intValue2;
                }
                v2Var3.f31707p = intValue2;
                v2Var3.f31702k.invalidate();
                return;
        }
    }
}
