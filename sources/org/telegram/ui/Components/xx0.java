package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32496a;
    public final View f32497b;
    public final FrameLayout f32498c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32496a = i10;
        this.f32498c = frameLayout;
        this.f32497b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32496a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32498c;
                yx0Var.f32754b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((hn0) this.f32497b).invalidate();
                return;
            default:
                ((e91) this.f32498c).E(this.f32497b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
