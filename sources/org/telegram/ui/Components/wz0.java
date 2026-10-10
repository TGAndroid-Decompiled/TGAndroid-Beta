package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wz0 extends AnimatorListenerAdapter {
    public final int f32790a;
    public final Switch f32791b;

    public wz0(Switch r12, int i10) {
        this.f32790a = i10;
        this.f32791b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32790a) {
            case 0:
                this.f32791b.d = null;
                return;
            default:
                this.f32791b.f24344e = null;
                return;
        }
    }
}
