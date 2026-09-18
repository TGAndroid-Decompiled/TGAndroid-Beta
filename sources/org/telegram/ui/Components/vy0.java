package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vy0 extends AnimatorListenerAdapter {
    public final int f29432a;
    public final Switch f29433b;

    public vy0(Switch r12, int i10) {
        this.f29432a = i10;
        this.f29433b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29432a) {
            case 0:
                this.f29433b.d = null;
                return;
            default:
                this.f29433b.e = null;
                return;
        }
    }
}
