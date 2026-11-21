package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34370a;
    public final f30 f34371b;

    public d30(f30 f30Var, int i7) {
        this.f34370a = i7;
        this.f34371b = f30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f34370a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var = this.f34371b;
                f30Var.f35077x = floatValue;
                f30Var.f35071e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                f30Var.f35071e.setPadding(0, 0, 0, (int) (f30Var.f35077x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var2 = this.f34371b;
                f30Var2.F = floatValue2;
                f30Var2.f35073n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                f30Var2.f35073n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, f30Var2.F));
                org.telegram.ui.nj njVar = f30Var2.f35072f;
                if (njVar != null && (cnVar = njVar.f47010a) != null && (b1Var = cnVar.f45950a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                    f30Var2.f35072f.f47010a.f45950a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                }
                f30Var2.h.setAlpha(f30Var2.F);
                return;
        }
    }
}
