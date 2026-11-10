package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36782a;
    public final r20 f36783b;

    public p20(r20 r20Var, int i7) {
        this.f36782a = i7;
        this.f36783b = r20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.f36782a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var = this.f36783b;
                r20Var.f37482x = floatValue;
                r20Var.f37476e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                r20Var.f37476e.setPadding(0, 0, 0, (int) (r20Var.f37482x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var2 = this.f36783b;
                r20Var2.E = floatValue2;
                r20Var2.f37478n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                r20Var2.f37478n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.oj ojVar = r20Var2.f37477f;
                if (ojVar != null && (dnVar = ojVar.f45407a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f37477f.f45407a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                }
                r20Var2.h.setAlpha(r20Var2.E);
                return;
        }
    }
}
