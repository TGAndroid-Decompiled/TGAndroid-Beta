package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ox0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27195a;
    public final View f27196b;
    public final FrameLayout f27197c;

    public ox0(FrameLayout frameLayout, View view, int i10) {
        this.f27195a = i10;
        this.f27197c = frameLayout;
        this.f27196b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27195a) {
            case 0:
                px0 px0Var = (px0) this.f27197c;
                px0Var.f27430b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                ((wm0) this.f27196b).invalidate();
                return;
            default:
                ((y81) this.f27197c).E(this.f27196b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
