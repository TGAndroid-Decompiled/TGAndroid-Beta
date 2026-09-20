package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30472a;
    public final float f30473b;
    public final boolean f30474c;
    public final d9 d;

    public y8(d9 d9Var, float f7, float f10, boolean z10) {
        this.d = d9Var;
        this.f30472a = f7;
        this.f30473b = f10;
        this.f30474c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d9 d9Var = this.d;
        d9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f30472a, this.f30473b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
        kVar.getTitleTextView().setAlpha(d9Var.N);
        if (d9Var.F && !this.f30474c) {
            d9Var.i0(1.0f - d9Var.N, false);
        }
        d9Var.f23527r.setTranslationY(lerp);
        d9Var.f23530x.setTranslationY(lerp);
        d9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
        kVar2.invalidate();
    }
}
