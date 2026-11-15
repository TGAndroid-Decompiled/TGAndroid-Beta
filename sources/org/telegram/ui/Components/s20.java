package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39168a;
    public final u20 f39169b;

    public s20(u20 u20Var, int i7) {
        this.f39168a = i7;
        this.f39169b = u20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
        switch (this.f39168a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var = this.f39169b;
                u20Var.f39885x = floatValue;
                u20Var.f39879e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                u20Var.f39879e.setPadding(0, 0, 0, (int) (u20Var.f39885x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var2 = this.f39169b;
                u20Var2.F = floatValue2;
                u20Var2.f39881n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                u20Var2.f39881n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, u20Var2.F));
                org.telegram.ui.mj mjVar = u20Var2.f39880f;
                if (mjVar != null && (bnVar = mjVar.f46216a) != null && (c1Var = bnVar.f45122a4) != null) {
                    c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                    u20Var2.f39880f.f46216a.f45122a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                }
                u20Var2.h.setAlpha(u20Var2.F);
                return;
        }
    }
}
