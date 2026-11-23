package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40982a;
    public final i3 f40983b;

    public g3(i3 i3Var, int i7) {
        this.f40982a = i7;
        this.f40983b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40982a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3 i3Var = this.f40983b;
                i3Var.f41038n = floatValue;
                i3Var.f41035k.invalidate();
                if (i3Var.f41038n > 1.0f && i3Var.f41042r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    i3Var.f41042r = ofInt;
                    ofInt.addUpdateListener(new g3(i3Var, 2));
                    i3Var.f41042r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    i3Var.f41042r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var2 = this.f40983b;
                i3Var2.f41037m = intValue;
                i3Var2.f41035k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var3 = this.f40983b;
                if (i3Var3.f41033i <= i3Var3.f41039o / 2) {
                    intValue2 = -intValue2;
                }
                i3Var3.f41040p = intValue2;
                i3Var3.f41035k.invalidate();
                return;
        }
    }
}
