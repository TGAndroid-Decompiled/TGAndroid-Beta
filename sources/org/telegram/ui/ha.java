package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f46280a;
    public final ia f46281b;

    public ha(ia iaVar, int i7) {
        this.f46280a = i7;
        this.f46281b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46280a) {
            case 0:
                ia iaVar = this.f46281b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f46592n = floatValue;
                iaVar.f46591f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f46592n);
                return;
            default:
                ia iaVar2 = this.f46281b;
                iaVar2.getClass();
                iaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.m6.f28300z6;
                org.telegram.ui.ActionBar.h6 h6Var = iaVar2.f46588b;
                int f10 = i0.a.f(iaVar2.E, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var));
                iaVar2.f46590e.b(f10);
                iaVar2.f46591f.setTextColor(f10);
                return;
        }
    }
}
