package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fz0 extends AnimatorListenerAdapter {
    public final int f24208a;
    public final Switch f24209b;

    public fz0(Switch r12, int i10) {
        this.f24208a = i10;
        this.f24209b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24208a) {
            case 0:
                this.f24209b.d = null;
                return;
            default:
                this.f24209b.e = null;
                return;
        }
    }
}
