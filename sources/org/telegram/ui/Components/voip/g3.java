package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41020a;
    public final i3 f41021b;

    public g3(i3 i3Var, int i7) {
        this.f41020a = i7;
        this.f41021b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41020a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3 i3Var = this.f41021b;
                i3Var.f41076n = floatValue;
                i3Var.f41073k.invalidate();
                if (i3Var.f41076n > 1.0f && i3Var.f41080r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    i3Var.f41080r = ofInt;
                    ofInt.addUpdateListener(new g3(i3Var, 2));
                    i3Var.f41080r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    i3Var.f41080r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var2 = this.f41021b;
                i3Var2.f41075m = intValue;
                i3Var2.f41073k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var3 = this.f41021b;
                if (i3Var3.f41071i <= i3Var3.f41077o / 2) {
                    intValue2 = -intValue2;
                }
                i3Var3.f41078p = intValue2;
                i3Var3.f41073k.invalidate();
                return;
        }
    }
}
