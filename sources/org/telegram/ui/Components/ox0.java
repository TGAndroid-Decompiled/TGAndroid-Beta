package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ox0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27193a;
    public final View f27194b;
    public final FrameLayout f27195c;

    public ox0(FrameLayout frameLayout, View view, int i10) {
        this.f27193a = i10;
        this.f27195c = frameLayout;
        this.f27194b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27193a) {
            case 0:
                px0 px0Var = (px0) this.f27195c;
                px0Var.f27438b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                ((wm0) this.f27194b).invalidate();
                return;
            default:
                ((y81) this.f27195c).E(this.f27194b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
