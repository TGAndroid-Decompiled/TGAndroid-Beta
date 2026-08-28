package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f32107a;
    public final float f32108b;
    public final boolean f32109c;
    public final w8 d;

    public r8(w8 w8Var, float f10, float f11, boolean z10) {
        this.d = w8Var;
        this.f32107a = f10;
        this.f32108b = f11;
        this.f32109c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8 w8Var = this.d;
        w8Var.J = floatValue;
        float lerp = AndroidUtilities.lerp(this.f32107a, this.f32108b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
        kVar.getTitleTextView().setAlpha(w8Var.J);
        if (w8Var.B && !this.f32109c) {
            w8Var.h0(1.0f - w8Var.J, false);
        }
        w8Var.f34144r.setTranslationY(lerp);
        w8Var.f34147x.setTranslationY(lerp);
        w8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
        kVar2.invalidate();
    }
}
