package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32495a;
    public final View f32496b;
    public final FrameLayout f32497c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32495a = i10;
        this.f32497c = frameLayout;
        this.f32496b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32495a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32497c;
                yx0Var.f32753b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((hn0) this.f32496b).invalidate();
                return;
            default:
                ((e91) this.f32497c).E(this.f32496b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
