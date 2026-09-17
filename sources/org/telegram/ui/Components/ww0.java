package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ww0 extends AnimatorListenerAdapter {
    public final int f32384a;
    public final xw0 f32385b;

    public ww0(xw0 xw0Var, int i10) {
        this.f32384a = i10;
        this.f32385b = xw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32384a) {
            case 0:
                this.f32385b.f32787s.setVisibility(8);
                return;
            case 1:
                this.f32385b.f32787s.setVisibility(8);
                return;
            default:
                this.f32385b.f32787s.setVisibility(8);
                return;
        }
    }
}
