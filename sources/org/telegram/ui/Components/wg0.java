package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f32121a;
    public final zg0 f32122b;

    public wg0(zg0 zg0Var, int i10) {
        this.f32121a = i10;
        this.f32122b = zg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32121a) {
            case 0:
                this.f32122b.F = null;
                return;
            default:
                this.f32122b.u();
                return;
        }
    }
}
