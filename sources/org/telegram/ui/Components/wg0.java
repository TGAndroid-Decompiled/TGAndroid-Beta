package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f32111a;
    public final zg0 f32112b;

    public wg0(zg0 zg0Var, int i10) {
        this.f32111a = i10;
        this.f32112b = zg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32111a) {
            case 0:
                this.f32112b.F = null;
                return;
            default:
                this.f32112b.u();
                return;
        }
    }
}
