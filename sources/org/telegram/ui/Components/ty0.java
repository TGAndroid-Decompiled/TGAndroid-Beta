package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f30770a;
    public final Switch f30771b;

    public ty0(Switch r12, int i10) {
        this.f30770a = i10;
        this.f30771b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30770a) {
            case 0:
                this.f30771b.d = null;
                return;
            default:
                this.f30771b.f24179e = null;
                return;
        }
    }
}
