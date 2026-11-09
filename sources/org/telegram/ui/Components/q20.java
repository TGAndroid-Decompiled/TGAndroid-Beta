package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37183a;
    public final s20 f37184b;

    public q20(s20 s20Var, int i7) {
        this.f37183a = i7;
        this.f37184b = s20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.f37183a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s20 s20Var = this.f37184b;
                s20Var.f37893x = floatValue;
                s20Var.f37887e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                s20Var.f37887e.setPadding(0, 0, 0, (int) (s20Var.f37893x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s20 s20Var2 = this.f37184b;
                s20Var2.E = floatValue2;
                s20Var2.f37889n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                s20Var2.f37889n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, s20Var2.E));
                org.telegram.ui.oj ojVar = s20Var2.f37888f;
                if (ojVar != null && (dnVar = ojVar.f45471a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                    s20Var2.f37888f.f45471a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                }
                s20Var2.h.setAlpha(s20Var2.E);
                return;
        }
    }
}
