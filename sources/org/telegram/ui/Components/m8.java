package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class m8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f36066a;
    public final float f36067b;
    public final boolean f36068c;
    public final r8 d;

    public m8(r8 r8Var, float f10, float f11, boolean z10) {
        this.d = r8Var;
        this.f36066a = f10;
        this.f36067b = f11;
        this.f36068c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r8 r8Var = this.d;
        r8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f36066a, this.f36067b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
        kVar.getTitleTextView().setAlpha(r8Var.O);
        if (r8Var.G && !this.f36068c) {
            r8Var.n0(false, 1.0f - r8Var.O);
        }
        r8Var.f37676r.setTranslationY(T1);
        r8Var.f37680y.setTranslationY(T1);
        r8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
        kVar2.invalidate();
    }
}
