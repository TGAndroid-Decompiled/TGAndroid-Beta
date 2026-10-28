package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b01 extends AnimatorListenerAdapter {
    public final int f26705a;
    public final Switch f26706b;

    public b01(Switch r12, int i10) {
        this.f26705a = i10;
        this.f26706b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26705a) {
            case 0:
                this.f26706b.d = null;
                return;
            default:
                this.f26706b.e = null;
                return;
        }
    }
}
