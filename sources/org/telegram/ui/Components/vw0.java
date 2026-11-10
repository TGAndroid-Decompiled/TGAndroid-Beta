package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39752a;
    public final Switch f39753b;

    public vw0(Switch r12, int i7) {
        this.f39752a = i7;
        this.f39753b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39752a) {
            case 0:
                this.f39753b.d = null;
                return;
            default:
                this.f39753b.f31574e = null;
                return;
        }
    }
}
