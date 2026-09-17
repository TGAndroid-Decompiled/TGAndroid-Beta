package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ww0 extends AnimatorListenerAdapter {
    public final int f32357a;
    public final xw0 f32358b;

    public ww0(xw0 xw0Var, int i10) {
        this.f32357a = i10;
        this.f32358b = xw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32357a) {
            case 0:
                this.f32358b.f32760s.setVisibility(8);
                return;
            case 1:
                this.f32358b.f32760s.setVisibility(8);
                return;
            default:
                this.f32358b.f32760s.setVisibility(8);
                return;
        }
    }
}
