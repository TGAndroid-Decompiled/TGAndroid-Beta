package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zx0 extends AnimatorListenerAdapter {
    public final int f33259a;
    public final Switch f33260b;

    public zx0(Switch r12, int i10) {
        this.f33259a = i10;
        this.f33260b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33259a) {
            case 0:
                this.f33260b.d = null;
                return;
            default:
                this.f33260b.e = null;
                return;
        }
    }
}
