package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30640a;
    public final float f30641b;
    public final boolean f30642c;
    public final w8 d;

    public r8(w8 w8Var, float f10, float f11, boolean z4) {
        this.d = w8Var;
        this.f30640a = f10;
        this.f30641b = f11;
        this.f30642c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8 w8Var = this.d;
        w8Var.K = floatValue;
        float lerp = AndroidUtilities.lerp(this.f30640a, this.f30641b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar.getTitleTextView().setAlpha(w8Var.K);
        if (w8Var.C && !this.f30642c) {
            w8Var.i0(1.0f - w8Var.K, false);
        }
        w8Var.f32676r.setTranslationY(lerp);
        w8Var.f32679x.setTranslationY(lerp);
        w8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar2.invalidate();
    }
}
