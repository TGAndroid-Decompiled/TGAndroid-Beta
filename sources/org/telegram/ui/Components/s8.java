package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f39529a;
    public final float f39530b;
    public final boolean f39531c;
    public final x8 d;

    public s8(x8 x8Var, float f10, float f11, boolean z10) {
        this.d = x8Var;
        this.f39529a = f10;
        this.f39530b = f11;
        this.f39531c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x8 x8Var = this.d;
        x8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f39529a, this.f39530b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
        kVar.getTitleTextView().setAlpha(x8Var.O);
        if (x8Var.G && !this.f39531c) {
            x8Var.n0(false, 1.0f - x8Var.O);
        }
        x8Var.f41927r.setTranslationY(T1);
        x8Var.f41931y.setTranslationY(T1);
        x8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
        kVar2.invalidate();
    }
}
