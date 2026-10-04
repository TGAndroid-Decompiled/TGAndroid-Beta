package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32997a;
    public final View f32998b;
    public final FrameLayout f32999c;

    public xx0(FrameLayout frameLayout, View view, int i10) {
        this.f32997a = i10;
        this.f32999c = frameLayout;
        this.f32998b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32997a) {
            case 0:
                yx0 yx0Var = (yx0) this.f32999c;
                yx0Var.f33274b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                ((an0) this.f32998b).invalidate();
                return;
            default:
                ((g91) this.f32999c).F(this.f32998b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
