package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vz0 extends AnimatorListenerAdapter {
    public final int f32486a;
    public final Switch f32487b;

    public vz0(Switch r12, int i10) {
        this.f32486a = i10;
        this.f32487b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32486a) {
            case 0:
                this.f32487b.d = null;
                return;
            default:
                this.f32487b.f24340e = null;
                return;
        }
    }
}
