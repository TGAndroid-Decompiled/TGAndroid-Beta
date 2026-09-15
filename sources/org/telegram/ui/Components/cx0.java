package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class cx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23157a;
    public final View f23158b;
    public final FrameLayout f23159c;

    public cx0(FrameLayout frameLayout, View view, int i10) {
        this.f23157a = i10;
        this.f23159c = frameLayout;
        this.f23158b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23157a) {
            case 0:
                dx0 dx0Var = (dx0) this.f23159c;
                dx0Var.f23408b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                ((im0) this.f23158b).invalidate();
                return;
            default:
                ((i81) this.f23159c).E(this.f23158b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
