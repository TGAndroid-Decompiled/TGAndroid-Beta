package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f39940a;
    public final float f39941b;
    public final boolean f39942c;
    public final y8 d;

    public t8(y8 y8Var, float f10, float f11, boolean z10) {
        this.d = y8Var;
        this.f39940a = f10;
        this.f39941b = f11;
        this.f39942c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y8 y8Var = this.d;
        y8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f39940a, this.f39941b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.h2) y8Var).actionBar;
        kVar.getTitleTextView().setAlpha(y8Var.O);
        if (y8Var.G && !this.f39942c) {
            y8Var.n0(false, 1.0f - y8Var.O);
        }
        y8Var.f42403r.setTranslationY(T1);
        y8Var.f42407y.setTranslationY(T1);
        y8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.h2) y8Var).actionBar;
        kVar2.invalidate();
    }
}
