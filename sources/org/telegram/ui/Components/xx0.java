package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32491a;
    public final View f32492b;
    public final FrameLayout f32493c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32491a = i10;
        this.f32493c = frameLayout;
        this.f32492b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32491a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32493c;
                yx0Var.f32749b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((hn0) this.f32492b).invalidate();
                return;
            default:
                ((e91) this.f32493c).E(this.f32492b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
