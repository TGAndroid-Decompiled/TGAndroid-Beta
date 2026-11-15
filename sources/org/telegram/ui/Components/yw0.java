package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f42173a;
    public final Switch f42174b;

    public yw0(Switch r12, int i7) {
        this.f42173a = i7;
        this.f42174b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42173a) {
            case 0:
                this.f42174b.d = null;
                return;
            default:
                this.f42174b.f32739e = null;
                return;
        }
    }
}
