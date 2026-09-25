package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26590a;
    public final View f26591b;
    public final FrameLayout f26592c;

    public mx0(FrameLayout frameLayout, View view, int i10) {
        this.f26590a = i10;
        this.f26592c = frameLayout;
        this.f26591b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26590a) {
            case 0:
                nx0 nx0Var = (nx0) this.f26592c;
                nx0Var.f26815b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                ((um0) this.f26591b).invalidate();
                return;
            default:
                ((w81) this.f26592c).E(this.f26591b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
