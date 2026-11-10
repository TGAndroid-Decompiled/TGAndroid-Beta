package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f36256a;
    public final float f36257b;
    public final boolean f36258c;
    public final s8 d;

    public n8(s8 s8Var, float f10, float f11, boolean z9) {
        this.d = s8Var;
        this.f36256a = f10;
        this.f36257b = f11;
        this.f36258c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s8 s8Var = this.d;
        s8Var.N = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.f36256a, this.f36257b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
        lVar.getTitleTextView().setAlpha(s8Var.N);
        if (s8Var.F && !this.f36258c) {
            s8Var.n0(false, 1.0f - s8Var.N);
        }
        s8Var.f37895r.setTranslationY(T1);
        s8Var.f37899y.setTranslationY(T1);
        s8Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
        lVar2.invalidate();
    }
}
