package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f46309a;
    public final ia f46310b;

    public ha(ia iaVar, int i7) {
        this.f46309a = i7;
        this.f46310b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46309a) {
            case 0:
                ia iaVar = this.f46310b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f46622n = floatValue;
                iaVar.f46621f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f46622n);
                return;
            default:
                ia iaVar2 = this.f46310b;
                iaVar2.getClass();
                iaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.k6.f28258z6;
                org.telegram.ui.ActionBar.f6 f6Var = iaVar2.f46618b;
                int f10 = i0.a.f(iaVar2.E, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var));
                iaVar2.f46620e.b(f10);
                iaVar2.f46621f.setTextColor(f10);
                return;
        }
    }
}
