package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39308a;
    public final View f39309b;
    public final FrameLayout f39310c;

    public rv0(FrameLayout frameLayout, View view, int i7) {
        this.f39308a = i7;
        this.f39310c = frameLayout;
        this.f39309b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39308a) {
            case 0:
                sv0 sv0Var = (sv0) this.f39310c;
                sv0Var.f39652b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                ((gl0) this.f39309b).invalidate();
                return;
            default:
                ((j71) this.f39310c).B(this.f39309b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
