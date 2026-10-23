package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f30578a;
    public final Switch f30579b;

    public sz0(Switch r12, int i10) {
        this.f30578a = i10;
        this.f30579b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30578a) {
            case 0:
                this.f30579b.d = null;
                return;
            default:
                this.f30579b.e = null;
                return;
        }
    }
}
