package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24332a;
    public final float f24333b;
    public final boolean f24334c;
    public final f9 d;

    public a9(f9 f9Var, float f7, float f10, boolean z10) {
        this.d = f9Var;
        this.f24332a = f7;
        this.f24333b = f10;
        this.f24334c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f9 f9Var = this.d;
        f9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f24332a, this.f24333b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar.getTitleTextView().setAlpha(f9Var.N);
        if (f9Var.F && !this.f24334c) {
            f9Var.i0(1.0f - f9Var.N, false);
        }
        f9Var.f26000r.setTranslationY(lerp);
        f9Var.f26003x.setTranslationY(lerp);
        f9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar2.invalidate();
    }
}
