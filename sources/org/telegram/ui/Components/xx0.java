package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32991a;
    public final View f32992b;
    public final FrameLayout f32993c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32991a = i10;
        this.f32993c = frameLayout;
        this.f32992b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32991a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32993c;
                yx0Var.f33268b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((an0) this.f32992b).invalidate();
                return;
            default:
                ((g91) this.f32993c).F(this.f32992b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
