package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ez0 extends AnimatorListenerAdapter {
    public final int f24016a;
    public final Switch f24017b;

    public ez0(Switch r12, int i10) {
        this.f24016a = i10;
        this.f24017b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24016a) {
            case 0:
                this.f24017b.d = null;
                return;
            default:
                this.f24017b.e = null;
                return;
        }
    }
}
