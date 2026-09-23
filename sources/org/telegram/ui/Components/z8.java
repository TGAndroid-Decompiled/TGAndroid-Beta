package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30539a;
    public final float f30540b;
    public final boolean f30541c;
    public final e9 d;

    public z8(e9 e9Var, float f7, float f10, boolean z10) {
        this.d = e9Var;
        this.f30539a = f7;
        this.f30540b = f10;
        this.f30541c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e9 e9Var = this.d;
        e9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f30539a, this.f30540b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) e9Var).actionBar;
        kVar.getTitleTextView().setAlpha(e9Var.N);
        if (e9Var.F && !this.f30541c) {
            e9Var.i0(1.0f - e9Var.N, false);
        }
        e9Var.f23614r.setTranslationY(lerp);
        e9Var.f23617x.setTranslationY(lerp);
        e9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) e9Var).actionBar;
        kVar2.invalidate();
    }
}
