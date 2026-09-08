package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24844a;
    public final View f24845b;
    public final FrameLayout f24846c;

    public bx0(FrameLayout frameLayout, View view, int i10) {
        this.f24844a = i10;
        this.f24846c = frameLayout;
        this.f24845b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24844a) {
            case 0:
                cx0 cx0Var = (cx0) this.f24846c;
                cx0Var.f25134b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                ((im0) this.f24845b).invalidate();
                return;
            default:
                ((i81) this.f24846c).E(this.f24845b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
