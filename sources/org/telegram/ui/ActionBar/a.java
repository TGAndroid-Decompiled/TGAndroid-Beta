package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.ru0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f28748a;
    public final k f28749b;

    public a(k kVar, int i7) {
        this.f28748a = i7;
        this.f28749b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f28748a) {
            case 0:
                ru0 ru0Var = this.f28749b.f29073f1;
                if (ru0Var != null) {
                    ru0Var.run();
                    return;
                }
                return;
            case 1:
                ru0 ru0Var2 = this.f28749b.f29073f1;
                if (ru0Var2 != null) {
                    ru0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f28749b;
                kVar.f29090p0 = floatValue;
                if (kVar.f29057a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f29090p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f29057a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (zVar = kVar.F) != null) {
                    zVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f29090p0));
                }
                ru0 ru0Var3 = kVar.f29073f1;
                if (ru0Var3 != null) {
                    ru0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f28749b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                return;
            default:
                k kVar3 = this.f28749b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                return;
        }
    }
}
