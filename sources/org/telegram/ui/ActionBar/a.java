package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.pu0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f28394a;
    public final k f28395b;

    public a(k kVar, int i7) {
        this.f28394a = i7;
        this.f28395b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f28394a) {
            case 0:
                pu0 pu0Var = this.f28395b.f29289f1;
                if (pu0Var != null) {
                    pu0Var.run();
                    return;
                }
                return;
            case 1:
                pu0 pu0Var2 = this.f28395b.f29289f1;
                if (pu0Var2 != null) {
                    pu0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f28395b;
                kVar.f29306p0 = floatValue;
                if (kVar.f29273a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f29306p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f29273a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (yVar = kVar.F) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f29306p0));
                }
                pu0 pu0Var3 = kVar.f29289f1;
                if (pu0Var3 != null) {
                    pu0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f28395b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                return;
            default:
                k kVar3 = this.f28395b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                return;
        }
    }
}
