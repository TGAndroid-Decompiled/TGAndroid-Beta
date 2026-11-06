package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f32817a;
    public final fd0 f32818b;

    public dd0(fd0 fd0Var, int i7) {
        this.f32817a = i7;
        this.f32818b = fd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32817a) {
            case 0:
                this.f32818b.f33570s = null;
                return;
            default:
                this.f32818b.f33571w = null;
                return;
        }
    }
}
