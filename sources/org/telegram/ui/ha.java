package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f46289a;
    public final ia f46290b;

    public ha(ia iaVar, int i7) {
        this.f46289a = i7;
        this.f46290b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46289a) {
            case 0:
                ia iaVar = this.f46290b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f46613n = floatValue;
                iaVar.f46612f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f46613n);
                return;
            default:
                ia iaVar2 = this.f46290b;
                iaVar2.getClass();
                iaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.k6.f28258z6;
                org.telegram.ui.ActionBar.f6 f6Var = iaVar2.f46609b;
                int f10 = i0.a.f(iaVar2.E, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var));
                iaVar2.f46611e.b(f10);
                iaVar2.f46612f.setTextColor(f10);
                return;
        }
    }
}
