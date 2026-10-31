package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26606a;
    public final j21 f26607b;

    public h21(j21 j21Var, int i10) {
        this.f26606a = i10;
        this.f26607b = j21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26606a) {
            case 0:
                ih.c cVar = this.f26607b.f27202f;
                cVar.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.invalidate();
                return;
            default:
                j21 j21Var = this.f26607b;
                j21Var.getClass();
                j21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.h();
                return;
        }
    }
}
