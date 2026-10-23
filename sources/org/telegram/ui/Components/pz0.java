package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29420a;
    public final Switch f29421b;

    public pz0(Switch r12, int i10) {
        this.f29420a = i10;
        this.f29421b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29420a) {
            case 0:
                this.f29421b.d = null;
                return;
            default:
                this.f29421b.e = null;
                return;
        }
    }
}
