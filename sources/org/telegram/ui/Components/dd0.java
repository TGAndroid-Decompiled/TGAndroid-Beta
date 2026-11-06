package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f32830a;
    public final fd0 f32831b;

    public dd0(fd0 fd0Var, int i7) {
        this.f32830a = i7;
        this.f32831b = fd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32830a) {
            case 0:
                this.f32831b.f33514s = null;
                return;
            default:
                this.f32831b.f33515w = null;
                return;
        }
    }
}
