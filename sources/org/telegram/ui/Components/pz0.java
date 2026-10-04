package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29840a;
    public final Switch f29841b;

    public pz0(Switch r12, int i10) {
        this.f29840a = i10;
        this.f29841b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29840a) {
            case 0:
                this.f29841b.d = null;
                return;
            default:
                this.f29841b.f24342e = null;
                return;
        }
    }
}
