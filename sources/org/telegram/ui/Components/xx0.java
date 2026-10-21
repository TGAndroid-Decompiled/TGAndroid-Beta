package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32492a;
    public final View f32493b;
    public final FrameLayout f32494c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32492a = i10;
        this.f32494c = frameLayout;
        this.f32493b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32492a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32494c;
                yx0Var.f32750b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((hn0) this.f32493b).invalidate();
                return;
            default:
                ((e91) this.f32494c).E(this.f32493b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
