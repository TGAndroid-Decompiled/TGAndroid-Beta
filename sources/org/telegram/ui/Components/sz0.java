package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f28932a;
    public final Switch f28933b;

    public sz0(Switch r12, int i10) {
        this.f28932a = i10;
        this.f28933b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28932a) {
            case 0:
                this.f28933b.d = null;
                return;
            default:
                this.f28933b.e = null;
                return;
        }
    }
}
