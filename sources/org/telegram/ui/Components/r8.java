package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30688a;
    public final float f30689b;
    public final boolean f30690c;
    public final w8 d;

    public r8(w8 w8Var, float f10, float f11, boolean z4) {
        this.d = w8Var;
        this.f30688a = f10;
        this.f30689b = f11;
        this.f30690c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8 w8Var = this.d;
        w8Var.K = floatValue;
        float lerp = AndroidUtilities.lerp(this.f30688a, this.f30689b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar.getTitleTextView().setAlpha(w8Var.K);
        if (w8Var.C && !this.f30690c) {
            w8Var.i0(1.0f - w8Var.K, false);
        }
        w8Var.f32681r.setTranslationY(lerp);
        w8Var.f32684x.setTranslationY(lerp);
        w8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.p2) w8Var).actionBar;
        kVar2.invalidate();
    }
}
