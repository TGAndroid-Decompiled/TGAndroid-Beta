package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b01 extends AnimatorListenerAdapter {
    public final int f24521a;
    public final Switch f24522b;

    public b01(Switch r12, int i10) {
        this.f24521a = i10;
        this.f24522b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24521a) {
            case 0:
                this.f24522b.d = null;
                return;
            default:
                this.f24522b.f24117e = null;
                return;
        }
    }
}
