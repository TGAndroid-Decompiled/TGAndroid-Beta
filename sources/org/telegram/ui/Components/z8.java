package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30864a;
    public final float f30865b;
    public final boolean f30866c;
    public final e9 d;

    public z8(e9 e9Var, float f7, float f10, boolean z10) {
        this.d = e9Var;
        this.f30864a = f7;
        this.f30865b = f10;
        this.f30866c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e9 e9Var = this.d;
        e9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f30864a, this.f30865b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.o2) e9Var).actionBar;
        lVar.getTitleTextView().setAlpha(e9Var.N);
        if (e9Var.F && !this.f30866c) {
            e9Var.i0(1.0f - e9Var.N, false);
        }
        e9Var.f23984r.setTranslationY(lerp);
        e9Var.f23987x.setTranslationY(lerp);
        e9Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.o2) e9Var).actionBar;
        lVar2.invalidate();
    }
}
