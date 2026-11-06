package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.ru0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f27294a;
    public final k f27295b;

    public a(k kVar, int i7) {
        this.f27294a = i7;
        this.f27295b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f27294a) {
            case 0:
                ru0 ru0Var = this.f27295b.f27659e1;
                if (ru0Var != null) {
                    ru0Var.run();
                    return;
                }
                return;
            case 1:
                ru0 ru0Var2 = this.f27295b.f27659e1;
                if (ru0Var2 != null) {
                    ru0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f27295b;
                kVar.f27677o0 = floatValue;
                if (kVar.f27646a != null && kVar.R0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f27677o0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f27646a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.P0 && (yVar = kVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f27677o0));
                }
                ru0 ru0Var3 = kVar.f27659e1;
                if (ru0Var3 != null) {
                    ru0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f27295b;
                kVar2.getClass();
                kVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f();
                return;
            default:
                k kVar3 = this.f27295b;
                kVar3.getClass();
                kVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f();
                return;
        }
    }
}
