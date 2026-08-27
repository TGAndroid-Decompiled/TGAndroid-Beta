package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class q8 implements ValueAnimator.AnimatorUpdateListener {

    public final float f31831a;

    public final float f31832b;

    public final boolean f31833c;
    public final v8 d;

    public q8(v8 v8Var, float f10, float f11, boolean z10) {
        this.d = v8Var;
        this.f31831a = f10;
        this.f31832b = f11;
        this.f31833c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v8 v8Var = this.d;
        v8Var.J = fFloatValue;
        float fLerp = AndroidUtilities.lerp(this.f31831a, this.f31832b, fFloatValue);
        ((org.telegram.ui.ActionBar.n2) v8Var).actionBar.getTitleTextView().setAlpha(v8Var.J);
        if (v8Var.B && !this.f31833c) {
            v8Var.i0(1.0f - v8Var.J, false);
        }
        v8Var.f33301r.setTranslationY(fLerp);
        v8Var.f33304x.setTranslationY(fLerp);
        v8Var.fragmentView.invalidate();
        ((org.telegram.ui.ActionBar.n2) v8Var).actionBar.invalidate();
    }
}
