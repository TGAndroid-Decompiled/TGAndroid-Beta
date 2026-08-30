package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xy0 extends AnimatorListenerAdapter {
    public final int f30792a;
    public final Switch f30793b;

    public xy0(Switch r12, int i10) {
        this.f30792a = i10;
        this.f30793b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30792a) {
            case 0:
                this.f30793b.d = null;
                return;
            default:
                this.f30793b.e = null;
                return;
        }
    }
}
