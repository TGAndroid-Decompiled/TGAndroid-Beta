package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.pu0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f27345a;
    public final k f27346b;

    public a(k kVar, int i3) {
        this.f27345a = i3;
        this.f27346b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        x xVar;
        switch (this.f27345a) {
            case 0:
                pu0 pu0Var = this.f27346b.f27713f1;
                if (pu0Var != null) {
                    pu0Var.run();
                    return;
                }
                return;
            case 1:
                pu0 pu0Var2 = this.f27346b.f27713f1;
                if (pu0Var2 != null) {
                    pu0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f27346b;
                kVar.f27730p0 = floatValue;
                if (kVar.f27697a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f27730p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f27697a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (xVar = kVar.F) != null) {
                    xVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f27730p0));
                }
                pu0 pu0Var3 = kVar.f27713f1;
                if (pu0Var3 != null) {
                    pu0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f27346b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f();
                return;
            default:
                k kVar3 = this.f27346b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f();
                return;
        }
    }
}
