package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f28421a;
    public final float f28422b;
    public final boolean f28423c;
    public final w8 d;

    public r8(w8 w8Var, float f10, float f11, boolean z4) {
        this.d = w8Var;
        this.f28421a = f10;
        this.f28422b = f11;
        this.f28423c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8 w8Var = this.d;
        w8Var.K = floatValue;
        float lerp = AndroidUtilities.lerp(this.f28421a, this.f28422b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar.getTitleTextView().setAlpha(w8Var.K);
        if (w8Var.C && !this.f28423c) {
            w8Var.i0(1.0f - w8Var.K, false);
        }
        w8Var.f30178r.setTranslationY(lerp);
        w8Var.f30181x.setTranslationY(lerp);
        w8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar2.invalidate();
    }
}
