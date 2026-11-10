package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f32950a;
    public final fd0 f32951b;

    public dd0(fd0 fd0Var, int i7) {
        this.f32950a = i7;
        this.f32951b = fd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32950a) {
            case 0:
                this.f32951b.f33533s = null;
                return;
            default:
                this.f32951b.f33534w = null;
                return;
        }
    }
}
