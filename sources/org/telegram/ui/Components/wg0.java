package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f32113a;
    public final zg0 f32114b;

    public wg0(zg0 zg0Var, int i10) {
        this.f32113a = i10;
        this.f32114b = zg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32113a) {
            case 0:
                this.f32114b.F = null;
                return;
            default:
                this.f32114b.u();
                return;
        }
    }
}
