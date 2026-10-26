package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26787a;
    public final float f26788b;
    public final boolean f26789c;
    public final g9 d;

    public b9(g9 g9Var, float f7, float f10, boolean z10) {
        this.d = g9Var;
        this.f26787a = f7;
        this.f26788b = f10;
        this.f26789c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g9 g9Var = this.d;
        g9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f26787a, this.f26788b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
        kVar.getTitleTextView().setAlpha(g9Var.N);
        if (g9Var.F && !this.f26789c) {
            g9Var.j0(1.0f - g9Var.N, false);
        }
        g9Var.f28496r.setTranslationY(lerp);
        g9Var.f28499x.setTranslationY(lerp);
        g9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
        kVar2.invalidate();
    }
}
