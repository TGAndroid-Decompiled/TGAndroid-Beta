package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ha implements ValueAnimator.AnimatorUpdateListener {
    public final int f38832a;
    public final ia f38833b;

    public ha(ia iaVar, int i10) {
        this.f38832a = i10;
        this.f38833b = iaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38832a) {
            case 0:
                ia iaVar = this.f38833b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f39176n = floatValue;
                iaVar.f39175f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                iaVar.d.setAlpha(iaVar.f39176n);
                return;
            default:
                ia iaVar2 = this.f38833b;
                iaVar2.getClass();
                iaVar2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.f23450z6;
                org.telegram.ui.ActionBar.c6 c6Var = iaVar2.f39172b;
                int d = i0.a.d(iaVar2.A, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
                iaVar2.f39174e.b(d);
                iaVar2.f39175f.setTextColor(d);
                return;
        }
    }
}
