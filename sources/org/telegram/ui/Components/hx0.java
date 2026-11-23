package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f35988a;
    public final Switch f35989b;

    public hx0(Switch r12, int i7) {
        this.f35988a = i7;
        this.f35989b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35988a) {
            case 0:
                this.f35989b.d = null;
                return;
            default:
                this.f35989b.f33172e = null;
                return;
        }
    }
}
