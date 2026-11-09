package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f46266a;
    public final ia f46267b;

    public ha(ia iaVar, int i7) {
        this.f46266a = i7;
        this.f46267b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46266a) {
            case 0:
                ia iaVar = this.f46267b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f46541n = floatValue;
                iaVar.f46540f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f46541n);
                return;
            default:
                ia iaVar2 = this.f46267b;
                iaVar2.getClass();
                iaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.l6.f28275z6;
                org.telegram.ui.ActionBar.g6 g6Var = iaVar2.f46537b;
                int f10 = i0.a.f(iaVar2.E, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var));
                iaVar2.f46539e.b(f10);
                iaVar2.f46540f.setTextColor(f10);
                return;
        }
    }
}
