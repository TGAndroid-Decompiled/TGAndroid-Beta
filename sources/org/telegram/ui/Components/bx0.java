package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24817a;
    public final View f24818b;
    public final FrameLayout f24819c;

    public bx0(FrameLayout frameLayout, View view, int i10) {
        this.f24817a = i10;
        this.f24819c = frameLayout;
        this.f24818b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24817a) {
            case 0:
                cx0 cx0Var = (cx0) this.f24819c;
                cx0Var.f25107b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                ((im0) this.f24818b).invalidate();
                return;
            default:
                ((i81) this.f24819c).E(this.f24818b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
