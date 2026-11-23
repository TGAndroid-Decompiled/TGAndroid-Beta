package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.su0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f28745a;
    public final k f28746b;

    public a(k kVar, int i7) {
        this.f28745a = i7;
        this.f28746b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f28745a) {
            case 0:
                su0 su0Var = this.f28746b.f29101f1;
                if (su0Var != null) {
                    su0Var.run();
                    return;
                }
                return;
            case 1:
                su0 su0Var2 = this.f28746b.f29101f1;
                if (su0Var2 != null) {
                    su0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f28746b;
                kVar.f29118p0 = floatValue;
                if (kVar.f29085a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f29118p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f29085a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (yVar = kVar.F) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f29118p0));
                }
                su0 su0Var3 = kVar.f29101f1;
                if (su0Var3 != null) {
                    su0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f28746b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                return;
            default:
                k kVar3 = this.f28746b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                return;
        }
    }
}
