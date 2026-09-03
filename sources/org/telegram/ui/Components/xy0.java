package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xy0 extends AnimatorListenerAdapter {
    public final int f30774a;
    public final Switch f30775b;

    public xy0(Switch r12, int i10) {
        this.f30774a = i10;
        this.f30775b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30774a) {
            case 0:
                this.f30775b.d = null;
                return;
            default:
                this.f30775b.e = null;
                return;
        }
    }
}
