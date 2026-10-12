package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24588a;
    public final float f24589b;
    public final boolean f24590c;
    public final g9 d;

    public b9(g9 g9Var, float f7, float f10, boolean z10) {
        this.d = g9Var;
        this.f24588a = f7;
        this.f24589b = f10;
        this.f24590c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g9 g9Var = this.d;
        g9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f24588a, this.f24589b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.m2) g9Var).actionBar;
        kVar.getTitleTextView().setAlpha(g9Var.N);
        if (g9Var.F && !this.f24590c) {
            g9Var.i0(1.0f - g9Var.N, false);
        }
        g9Var.f26358r.setTranslationY(lerp);
        g9Var.f26361x.setTranslationY(lerp);
        g9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.m2) g9Var).actionBar;
        kVar2.invalidate();
    }
}
