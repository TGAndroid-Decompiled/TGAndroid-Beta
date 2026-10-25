package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26785a;
    public final float f26786b;
    public final boolean f26787c;
    public final g9 d;

    public b9(g9 g9Var, float f7, float f10, boolean z10) {
        this.d = g9Var;
        this.f26785a = f7;
        this.f26786b = f10;
        this.f26787c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g9 g9Var = this.d;
        g9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f26785a, this.f26786b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
        kVar.getTitleTextView().setAlpha(g9Var.N);
        if (g9Var.F && !this.f26787c) {
            g9Var.j0(1.0f - g9Var.N, false);
        }
        g9Var.f28494r.setTranslationY(lerp);
        g9Var.f28497x.setTranslationY(lerp);
        g9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.r2) g9Var).actionBar;
        kVar2.invalidate();
    }
}
