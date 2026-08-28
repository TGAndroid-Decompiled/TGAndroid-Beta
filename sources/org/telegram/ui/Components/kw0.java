package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class kw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30250a;
    public final View f30251b;
    public final FrameLayout f30252c;

    public kw0(FrameLayout frameLayout, View view, int i9) {
        this.f30250a = i9;
        this.f30252c = frameLayout;
        this.f30251b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30250a) {
            case 0:
                lw0 lw0Var = (lw0) this.f30252c;
                lw0Var.f30569b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.invalidate();
                ((sl0) this.f30251b).invalidate();
                return;
            default:
                ((n71) this.f30252c).E(this.f30251b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
