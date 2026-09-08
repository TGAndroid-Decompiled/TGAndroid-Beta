package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24331a;
    public final float f24332b;
    public final boolean f24333c;
    public final f9 d;

    public a9(f9 f9Var, float f7, float f10, boolean z10) {
        this.d = f9Var;
        this.f24331a = f7;
        this.f24332b = f10;
        this.f24333c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f9 f9Var = this.d;
        f9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f24331a, this.f24332b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar.getTitleTextView().setAlpha(f9Var.N);
        if (f9Var.F && !this.f24333c) {
            f9Var.i0(1.0f - f9Var.N, false);
        }
        f9Var.f25999r.setTranslationY(lerp);
        f9Var.f26002x.setTranslationY(lerp);
        f9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar2.invalidate();
    }
}
