package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29835a;
    public final Switch f29836b;

    public pz0(Switch r12, int i10) {
        this.f29835a = i10;
        this.f29836b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29835a) {
            case 0:
                this.f29836b.d = null;
                return;
            default:
                this.f29836b.f24338e = null;
                return;
        }
    }
}
