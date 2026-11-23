package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f35989a;
    public final Switch f35990b;

    public hx0(Switch r12, int i7) {
        this.f35989a = i7;
        this.f35990b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35989a) {
            case 0:
                this.f35990b.d = null;
                return;
            default:
                this.f35990b.f33172e = null;
                return;
        }
    }
}
