package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ox0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27194a;
    public final View f27195b;
    public final FrameLayout f27196c;

    public ox0(FrameLayout frameLayout, View view, int i10) {
        this.f27194a = i10;
        this.f27196c = frameLayout;
        this.f27195b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27194a) {
            case 0:
                px0 px0Var = (px0) this.f27196c;
                px0Var.f27439b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                ((wm0) this.f27195b).invalidate();
                return;
            default:
                ((y81) this.f27196c).E(this.f27195b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
