package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39165a;
    public final u20 f39166b;

    public s20(u20 u20Var, int i7) {
        this.f39165a = i7;
        this.f39166b = u20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
        switch (this.f39165a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var = this.f39166b;
                u20Var.f39882x = floatValue;
                u20Var.f39876e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                u20Var.f39876e.setPadding(0, 0, 0, (int) (u20Var.f39882x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var2 = this.f39166b;
                u20Var2.F = floatValue2;
                u20Var2.f39878n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                u20Var2.f39878n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, u20Var2.F));
                org.telegram.ui.mj mjVar = u20Var2.f39877f;
                if (mjVar != null && (bnVar = mjVar.f46179a) != null && (c1Var = bnVar.f45121a4) != null) {
                    c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                    u20Var2.f39877f.f46179a.f45121a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                }
                u20Var2.h.setAlpha(u20Var2.F);
                return;
        }
    }
}
