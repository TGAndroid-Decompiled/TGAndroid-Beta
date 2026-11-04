package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39604a;
    public final u2 f39605b;

    public s2(u2 u2Var, int i3) {
        this.f39604a = i3;
        this.f39605b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39604a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var = this.f39605b;
                u2Var.f39643n = floatValue;
                u2Var.f39640k.invalidate();
                if (u2Var.f39643n > 1.0f && u2Var.f39647r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    u2Var.f39647r = ofInt;
                    ofInt.addUpdateListener(new s2(u2Var, 2));
                    u2Var.f39647r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    u2Var.f39647r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2 u2Var2 = this.f39605b;
                u2Var2.f39642m = intValue;
                u2Var2.f39640k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2 u2Var3 = this.f39605b;
                if (u2Var3.f39638i <= u2Var3.f39644o / 2) {
                    intValue2 = -intValue2;
                }
                u2Var3.f39645p = intValue2;
                u2Var3.f39640k.invalidate();
                return;
        }
    }
}
