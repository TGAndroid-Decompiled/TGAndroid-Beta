package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f35995a;
    public final Switch f35996b;

    public hx0(Switch r12, int i7) {
        this.f35995a = i7;
        this.f35996b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35995a) {
            case 0:
                this.f35996b.d = null;
                return;
            default:
                this.f35996b.f33169e = null;
                return;
        }
    }
}
