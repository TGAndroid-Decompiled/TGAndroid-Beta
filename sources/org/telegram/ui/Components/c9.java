package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f23970a;
    public final float f23971b;
    public final boolean f23972c;
    public final h9 d;

    public c9(h9 h9Var, float f7, float f10, boolean z10) {
        this.d = h9Var;
        this.f23970a = f7;
        this.f23971b = f10;
        this.f23972c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h9 h9Var = this.d;
        h9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f23970a, this.f23971b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
        kVar.getTitleTextView().setAlpha(h9Var.N);
        if (h9Var.F && !this.f23972c) {
            h9Var.i0(1.0f - h9Var.N, false);
        }
        h9Var.f25571r.setTranslationY(lerp);
        h9Var.f25574x.setTranslationY(lerp);
        h9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
        kVar2.invalidate();
    }
}
