package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ww0 extends AnimatorListenerAdapter {
    public final int f40170a;
    public final Switch f40171b;

    public ww0(Switch r12, int i7) {
        this.f40170a = i7;
        this.f40171b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40170a) {
            case 0:
                this.f40171b.d = null;
                return;
            default:
                this.f40171b.f31563e = null;
                return;
        }
    }
}
