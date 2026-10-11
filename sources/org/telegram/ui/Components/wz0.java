package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wz0 extends AnimatorListenerAdapter {
    public final int f32820a;
    public final Switch f32821b;

    public wz0(Switch r12, int i10) {
        this.f32820a = i10;
        this.f32821b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32820a) {
            case 0:
                this.f32821b.d = null;
                return;
            default:
                this.f32821b.f24368e = null;
                return;
        }
    }
}
