package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class y8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29268a;
    public final float f29269b;
    public final boolean f29270c;
    public final d9 d;

    public y8(d9 d9Var, float f7, float f10, boolean z10) {
        this.d = d9Var;
        this.f29268a = f7;
        this.f29269b = f10;
        this.f29270c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d9 d9Var = this.d;
        d9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.f29268a, this.f29269b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
        lVar.getTitleTextView().setAlpha(d9Var.N);
        if (d9Var.F && !this.f29270c) {
            d9Var.i0(1.0f - d9Var.N, false);
        }
        d9Var.f22332r.setTranslationY(lerp);
        d9Var.f22335x.setTranslationY(lerp);
        d9Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
        lVar2.invalidate();
    }
}
