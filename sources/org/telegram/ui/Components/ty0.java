package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f30769a;
    public final Switch f30770b;

    public ty0(Switch r12, int i10) {
        this.f30769a = i10;
        this.f30770b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30769a) {
            case 0:
                this.f30770b.d = null;
                return;
            default:
                this.f30770b.f24178e = null;
                return;
        }
    }
}
