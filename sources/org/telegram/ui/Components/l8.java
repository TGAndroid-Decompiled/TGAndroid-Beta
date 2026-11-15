package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f36725a;
    public final float f36726b;
    public final boolean f36727c;
    public final q8 d;

    public l8(q8 q8Var, float f10, float f11, boolean z10) {
        this.d = q8Var;
        this.f36725a = f10;
        this.f36726b = f11;
        this.f36727c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q8 q8Var = this.d;
        q8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f36725a, this.f36726b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
        kVar.getTitleTextView().setAlpha(q8Var.O);
        if (q8Var.G && !this.f36727c) {
            q8Var.n0(false, 1.0f - q8Var.O);
        }
        q8Var.f38571r.setTranslationY(T1);
        q8Var.f38575y.setTranslationY(T1);
        q8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
        kVar2.invalidate();
    }
}
