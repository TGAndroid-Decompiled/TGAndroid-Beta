package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rz0 extends AnimatorListenerAdapter {
    public final int f28972a;
    public final Switch f28973b;

    public rz0(Switch r12, int i10) {
        this.f28972a = i10;
        this.f28973b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28972a) {
            case 0:
                this.f28973b.d = null;
                return;
            default:
                this.f28973b.e = null;
                return;
        }
    }
}
