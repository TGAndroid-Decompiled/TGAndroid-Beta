package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f32867a;
    public final fd0 f32868b;

    public dd0(fd0 fd0Var, int i7) {
        this.f32867a = i7;
        this.f32868b = fd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32867a) {
            case 0:
                this.f32868b.f33531s = null;
                return;
            default:
                this.f32868b.f33532w = null;
                return;
        }
    }
}
