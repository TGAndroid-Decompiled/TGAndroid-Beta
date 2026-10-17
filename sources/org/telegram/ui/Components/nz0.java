package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nz0 extends AnimatorListenerAdapter {
    public final int f28844a;
    public final Switch f28845b;

    public nz0(Switch r12, int i10) {
        this.f28844a = i10;
        this.f28845b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28844a) {
            case 0:
                this.f28845b.d = null;
                return;
            default:
                this.f28845b.e = null;
                return;
        }
    }
}
