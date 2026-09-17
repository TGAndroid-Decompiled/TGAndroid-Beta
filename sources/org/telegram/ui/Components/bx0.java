package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24845a;
    public final View f24846b;
    public final FrameLayout f24847c;

    public bx0(FrameLayout frameLayout, View view, int i10) {
        this.f24845a = i10;
        this.f24847c = frameLayout;
        this.f24846b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24845a) {
            case 0:
                cx0 cx0Var = (cx0) this.f24847c;
                cx0Var.f25135b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                ((im0) this.f24846b).invalidate();
                return;
            default:
                ((i81) this.f24847c).E(this.f24846b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
