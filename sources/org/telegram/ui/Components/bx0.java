package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24818a;
    public final View f24819b;
    public final FrameLayout f24820c;

    public bx0(FrameLayout frameLayout, View view, int i10) {
        this.f24818a = i10;
        this.f24820c = frameLayout;
        this.f24819b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24818a) {
            case 0:
                cx0 cx0Var = (cx0) this.f24820c;
                cx0Var.f25108b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                ((im0) this.f24819b).invalidate();
                return;
            default:
                ((i81) this.f24820c).E(this.f24819b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
