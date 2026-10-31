package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vv0 extends AnimatorListenerAdapter {
    public final int f31850a;
    public final wv0 f31851b;

    public vv0(wv0 wv0Var, int i10) {
        this.f31850a = i10;
        this.f31851b = wv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31850a) {
            case 0:
                wv0 wv0Var = this.f31851b;
                wv0Var.D = 1.0f;
                wv0Var.invalidate();
                wv0Var.G = null;
                return;
            case 1:
                wv0 wv0Var2 = this.f31851b;
                wv0Var2.m(((Float) wv0Var2.f32262w.getAnimatedValue()).floatValue());
                wv0Var2.f32262w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f31851b.F = null;
                return;
        }
    }
}
