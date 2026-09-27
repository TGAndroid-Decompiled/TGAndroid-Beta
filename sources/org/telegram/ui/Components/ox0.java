package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ox0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27217a;
    public final View f27218b;
    public final FrameLayout f27219c;

    public ox0(FrameLayout frameLayout, View view, int i10) {
        this.f27217a = i10;
        this.f27219c = frameLayout;
        this.f27218b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27217a) {
            case 0:
                px0 px0Var = (px0) this.f27219c;
                px0Var.f27481b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                ((wm0) this.f27218b).invalidate();
                return;
            default:
                ((y81) this.f27219c).F(this.f27218b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
