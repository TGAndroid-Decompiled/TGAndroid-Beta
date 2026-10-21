package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29416a;
    public final Switch f29417b;

    public pz0(Switch r12, int i10) {
        this.f29416a = i10;
        this.f29417b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29416a) {
            case 0:
                this.f29417b.d = null;
                return;
            default:
                this.f29417b.e = null;
                return;
        }
    }
}
