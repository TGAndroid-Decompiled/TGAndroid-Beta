package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29419a;
    public final Switch f29420b;

    public pz0(Switch r12, int i10) {
        this.f29419a = i10;
        this.f29420b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29419a) {
            case 0:
                this.f29420b.d = null;
                return;
            default:
                this.f29420b.e = null;
                return;
        }
    }
}
