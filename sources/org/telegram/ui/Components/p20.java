package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36867a;
    public final r20 f36868b;

    public p20(r20 r20Var, int i7) {
        this.f36867a = i7;
        this.f36868b = r20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        switch (this.f36867a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var = this.f36868b;
                r20Var.f37581x = floatValue;
                r20Var.f37575e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                r20Var.f37575e.setPadding(0, 0, 0, (int) (r20Var.f37581x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var2 = this.f36868b;
                r20Var2.E = floatValue2;
                r20Var2.f37577n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                r20Var2.f37577n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.mj mjVar = r20Var2.f37576f;
                if (mjVar != null && (bnVar = mjVar.f44837a) != null && (q1Var = bnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f37576f.f44837a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                }
                r20Var2.h.setAlpha(r20Var2.E);
                return;
        }
    }
}
