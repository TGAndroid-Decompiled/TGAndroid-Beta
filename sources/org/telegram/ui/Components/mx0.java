package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26589a;
    public final View f26590b;
    public final FrameLayout f26591c;

    public mx0(FrameLayout frameLayout, View view, int i10) {
        this.f26589a = i10;
        this.f26591c = frameLayout;
        this.f26590b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26589a) {
            case 0:
                nx0 nx0Var = (nx0) this.f26591c;
                nx0Var.f26814b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                ((um0) this.f26590b).invalidate();
                return;
            default:
                ((w81) this.f26591c).E(this.f26590b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
