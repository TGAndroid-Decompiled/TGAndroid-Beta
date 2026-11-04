package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39809a;
    public final Switch f39810b;

    public vw0(Switch r12, int i3) {
        this.f39809a = i3;
        this.f39810b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39809a) {
            case 0:
                this.f39810b.d = null;
                return;
            default:
                this.f39810b.f31632e = null;
                return;
        }
    }
}
