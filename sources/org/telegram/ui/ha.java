package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f48313a;
    public final ia f48314b;

    public ha(ia iaVar, int i7) {
        this.f48313a = i7;
        this.f48314b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48313a) {
            case 0:
                ia iaVar = this.f48314b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f48673n = floatValue;
                iaVar.f48672f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.f48673n);
                return;
            default:
                ia iaVar2 = this.f48314b;
                iaVar2.getClass();
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.n6.f29807z6;
                org.telegram.ui.ActionBar.i6 i6Var = iaVar2.f48669b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29578n6, i6Var));
                iaVar2.f48671e.b(f10);
                iaVar2.f48672f.setTextColor(f10);
                return;
        }
    }
}
