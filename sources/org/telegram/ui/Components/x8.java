package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29905a;
    public final float f29906b;
    public final boolean f29907c;
    public final c9 d;

    public x8(c9 c9Var, float f7, float f10, boolean z10) {
        this.d = c9Var;
        this.f29905a = f7;
        this.f29906b = f10;
        this.f29907c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c9 c9Var = this.d;
        c9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f29905a, this.f29906b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
        kVar.getTitleTextView().setAlpha(c9Var.N);
        if (c9Var.F && !this.f29907c) {
            c9Var.i0(1.0f - c9Var.N, false);
        }
        c9Var.f22988r.setTranslationY(lerp);
        c9Var.f22991x.setTranslationY(lerp);
        c9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) c9Var).actionBar;
        kVar2.invalidate();
    }
}
