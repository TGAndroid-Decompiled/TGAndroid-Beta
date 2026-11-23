package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34328a;
    public final f30 f34329b;

    public d30(f30 f30Var, int i7) {
        this.f34328a = i7;
        this.f34329b = f30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f34328a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var = this.f34329b;
                f30Var.f35054x = floatValue;
                f30Var.f35048e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                f30Var.f35048e.setPadding(0, 0, 0, (int) (f30Var.f35054x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var2 = this.f34329b;
                f30Var2.F = floatValue2;
                f30Var2.f35050n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                f30Var2.f35050n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, f30Var2.F));
                org.telegram.ui.nj njVar = f30Var2.f35049f;
                if (njVar != null && (cnVar = njVar.f46973a) != null && (b1Var = cnVar.f45907a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                    f30Var2.f35049f.f46973a.f45907a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                }
                f30Var2.h.setAlpha(f30Var2.F);
                return;
        }
    }
}
