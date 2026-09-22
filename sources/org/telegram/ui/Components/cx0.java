package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class cx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23156a;
    public final View f23157b;
    public final FrameLayout f23158c;

    public cx0(FrameLayout frameLayout, View view, int i10) {
        this.f23156a = i10;
        this.f23158c = frameLayout;
        this.f23157b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23156a) {
            case 0:
                dx0 dx0Var = (dx0) this.f23158c;
                dx0Var.f23405b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                ((im0) this.f23157b).invalidate();
                return;
            default:
                ((i81) this.f23158c).E(this.f23157b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
