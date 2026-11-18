package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f48223a;
    public final ia f48224b;

    public ha(ia iaVar, int i7) {
        this.f48223a = i7;
        this.f48224b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48223a) {
            case 0:
                ia iaVar = this.f48224b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f48670n = floatValue;
                iaVar.f48669f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f48670n);
                return;
            default:
                ia iaVar2 = this.f48224b;
                iaVar2.getClass();
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.n6.f29805z6;
                org.telegram.ui.ActionBar.i6 i6Var = iaVar2.f48666b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29576n6, i6Var));
                iaVar2.f48668e.b(f10);
                iaVar2.f48669f.setTextColor(f10);
                return;
        }
    }
}
