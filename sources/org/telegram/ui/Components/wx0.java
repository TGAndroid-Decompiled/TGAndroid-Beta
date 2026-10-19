package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32222a;
    public final View f32223b;
    public final FrameLayout f32224c;

    public wx0(FrameLayout frameLayout, View view, int i10) {
        this.f32222a = i10;
        this.f32224c = frameLayout;
        this.f32223b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32222a) {
            case 0:
                xx0 xx0Var = (xx0) this.f32224c;
                xx0Var.f32468b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.invalidate();
                ((gn0) this.f32223b).invalidate();
                return;
            default:
                ((d91) this.f32224c).E(this.f32223b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
