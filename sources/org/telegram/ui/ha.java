package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f47643a;
    public final ia f47644b;

    public ha(ia iaVar, int i7) {
        this.f47643a = i7;
        this.f47644b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47643a) {
            case 0:
                ia iaVar = this.f47644b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f47992n = floatValue;
                iaVar.f47991f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f47992n);
                return;
            default:
                ia iaVar2 = this.f47644b;
                iaVar2.getClass();
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.j6.f29260z6;
                org.telegram.ui.ActionBar.e6 e6Var = iaVar2.f47988b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var));
                iaVar2.f47990e.b(f10);
                iaVar2.f47991f.setTextColor(f10);
                return;
        }
    }
}
