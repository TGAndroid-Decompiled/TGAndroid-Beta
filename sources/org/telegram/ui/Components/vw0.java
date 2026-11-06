package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39698a;
    public final Switch f39699b;

    public vw0(Switch r12, int i7) {
        this.f39698a = i7;
        this.f39699b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39698a) {
            case 0:
                this.f39699b.d = null;
                return;
            default:
                this.f39699b.f31553e = null;
                return;
        }
    }
}
