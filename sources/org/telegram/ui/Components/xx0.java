package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32990a;
    public final View f32991b;
    public final FrameLayout f32992c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32990a = i10;
        this.f32992c = frameLayout;
        this.f32991b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32990a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32992c;
                yx0Var.f33267b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((an0) this.f32991b).invalidate();
                return;
            default:
                ((g91) this.f32992c).F(this.f32991b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
