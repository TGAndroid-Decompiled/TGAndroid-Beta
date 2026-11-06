package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f36547a;
    public final float f36548b;
    public final boolean f36549c;
    public final t8 d;

    public o8(t8 t8Var, float f10, float f11, boolean z9) {
        this.d = t8Var;
        this.f36547a = f10;
        this.f36548b = f11;
        this.f36549c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t8 t8Var = this.d;
        t8Var.N = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f36547a, this.f36548b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
        kVar.getTitleTextView().setAlpha(t8Var.N);
        if (t8Var.F && !this.f36549c) {
            t8Var.n0(false, 1.0f - t8Var.N);
        }
        t8Var.f38283r.setTranslationY(T1);
        t8Var.f38287y.setTranslationY(T1);
        t8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
        kVar2.invalidate();
    }
}
