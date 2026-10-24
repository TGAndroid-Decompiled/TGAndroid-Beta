package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f32533a;
    public final float f32534b;
    public final boolean f32535c;
    public final c9 d;

    public x8(c9 c9Var, float f7, float f10, boolean z10) {
        this.d = c9Var;
        this.f32533a = f7;
        this.f32534b = f10;
        this.f32535c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c9 c9Var = this.d;
        c9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f32533a, this.f32534b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.o2) c9Var).actionBar;
        kVar.getTitleTextView().setAlpha(c9Var.N);
        if (c9Var.F && !this.f32535c) {
            c9Var.i0(1.0f - c9Var.N, false);
        }
        c9Var.f25263r.setTranslationY(lerp);
        c9Var.f25266x.setTranslationY(lerp);
        c9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.o2) c9Var).actionBar;
        kVar2.invalidate();
    }
}
