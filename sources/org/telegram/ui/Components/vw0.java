package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39716a;
    public final Switch f39717b;

    public vw0(Switch r12, int i7) {
        this.f39716a = i7;
        this.f39717b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39716a) {
            case 0:
                this.f39717b.d = null;
                return;
            default:
                this.f39717b.f31554e = null;
                return;
        }
    }
}
