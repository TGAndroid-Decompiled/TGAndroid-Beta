package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f32859a;
    public final fd0 f32860b;

    public dd0(fd0 fd0Var, int i7) {
        this.f32859a = i7;
        this.f32860b = fd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32859a) {
            case 0:
                this.f32860b.f33524s = null;
                return;
            default:
                this.f32860b.f33525w = null;
                return;
        }
    }
}
