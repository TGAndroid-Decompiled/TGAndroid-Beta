package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f48266a;
    public final ia f48267b;

    public ha(ia iaVar, int i7) {
        this.f48266a = i7;
        this.f48267b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48266a) {
            case 0:
                ia iaVar = this.f48267b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f48684n = floatValue;
                iaVar.f48683f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f48684n);
                return;
            default:
                ia iaVar2 = this.f48267b;
                iaVar2.getClass();
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.m6.f29758z6;
                org.telegram.ui.ActionBar.h6 h6Var = iaVar2.f48680b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29529n6, h6Var));
                iaVar2.f48682e.b(f10);
                iaVar2.f48683f.setTextColor(f10);
                return;
        }
    }
}
