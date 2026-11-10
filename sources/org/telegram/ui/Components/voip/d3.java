package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39159a;
    public final f3 f39160b;

    public d3(f3 f3Var, int i7) {
        this.f39159a = i7;
        this.f39160b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39159a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.f39160b;
                f3Var.f39218n = floatValue;
                f3Var.f39215k.invalidate();
                if (f3Var.f39218n > 1.0f && f3Var.f39222r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.f39222r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.f39222r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.f39222r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.f39160b;
                f3Var2.f39217m = intValue;
                f3Var2.f39215k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.f39160b;
                if (f3Var3.f39213i <= f3Var3.f39219o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.f39220p = intValue2;
                f3Var3.f39215k.invalidate();
                return;
        }
    }
}
