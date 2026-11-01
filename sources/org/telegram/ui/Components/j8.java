package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f27298a;
    public final float f27299b;
    public final boolean f27300c;
    public final o8 d;

    public j8(o8 o8Var, float f7, float f10, boolean z10) {
        this.d = o8Var;
        this.f27298a = f7;
        this.f27299b = f10;
        this.f27300c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o8 o8Var = this.d;
        o8Var.N = floatValue;
        float T1 = org.telegram.messenger.i0.T1(this.f27298a, this.f27299b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
        lVar.getTitleTextView().setAlpha(o8Var.N);
        if (o8Var.F && !this.f27300c) {
            o8Var.n0(false, 1.0f - o8Var.N);
        }
        o8Var.f29051r.setTranslationY(T1);
        o8Var.f29055y.setTranslationY(T1);
        o8Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
        lVar2.invalidate();
    }
}
