package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.ru0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f28746a;
    public final k f28747b;

    public a(k kVar, int i7) {
        this.f28746a = i7;
        this.f28747b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f28746a) {
            case 0:
                ru0 ru0Var = this.f28747b.f29071f1;
                if (ru0Var != null) {
                    ru0Var.run();
                    return;
                }
                return;
            case 1:
                ru0 ru0Var2 = this.f28747b.f29071f1;
                if (ru0Var2 != null) {
                    ru0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f28747b;
                kVar.f29088p0 = floatValue;
                if (kVar.f29055a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f29088p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f29055a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (zVar = kVar.F) != null) {
                    zVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f29088p0));
                }
                ru0 ru0Var3 = kVar.f29071f1;
                if (ru0Var3 != null) {
                    ru0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f28747b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                return;
            default:
                k kVar3 = this.f28747b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                return;
        }
    }
}
