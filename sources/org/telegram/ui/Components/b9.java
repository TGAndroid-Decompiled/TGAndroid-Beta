package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24889a;
    public final float f24890b;
    public final boolean f24891c;
    public final g9 d;

    public b9(g9 g9Var, float f7, float f10, boolean z10) {
        this.d = g9Var;
        this.f24889a = f7;
        this.f24890b = f10;
        this.f24891c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g9 g9Var = this.d;
        g9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f24889a, this.f24890b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
        kVar.getTitleTextView().setAlpha(g9Var.N);
        if (g9Var.F && !this.f24891c) {
            g9Var.i0(1.0f - g9Var.N, false);
        }
        g9Var.f26648r.setTranslationY(lerp);
        g9Var.f26651x.setTranslationY(lerp);
        g9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
        kVar2.invalidate();
    }
}
