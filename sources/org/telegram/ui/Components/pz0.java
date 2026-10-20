package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29415a;
    public final Switch f29416b;

    public pz0(Switch r12, int i10) {
        this.f29415a = i10;
        this.f29416b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29415a) {
            case 0:
                this.f29416b.d = null;
                return;
            default:
                this.f29416b.e = null;
                return;
        }
    }
}
