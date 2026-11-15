package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f47653a;
    public final ia f47654b;

    public ha(ia iaVar, int i7) {
        this.f47653a = i7;
        this.f47654b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47653a) {
            case 0:
                ia iaVar = this.f47654b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f48002n = floatValue;
                iaVar.f48001f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f48002n);
                return;
            default:
                ia iaVar2 = this.f47654b;
                iaVar2.getClass();
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.j6.f29260z6;
                org.telegram.ui.ActionBar.e6 e6Var = iaVar2.f47998b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var));
                iaVar2.f48000e.b(f10);
                iaVar2.f48001f.setTextColor(f10);
                return;
        }
    }
}
