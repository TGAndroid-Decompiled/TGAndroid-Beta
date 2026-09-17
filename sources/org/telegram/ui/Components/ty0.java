package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f30743a;
    public final Switch f30744b;

    public ty0(Switch r12, int i10) {
        this.f30743a = i10;
        this.f30744b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30743a) {
            case 0:
                this.f30744b.d = null;
                return;
            default:
                this.f30744b.f24152e = null;
                return;
        }
    }
}
