package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xz0 extends AnimatorListenerAdapter {
    public final int f33046a;
    public final Switch f33047b;

    public xz0(Switch r12, int i10) {
        this.f33046a = i10;
        this.f33047b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33046a) {
            case 0:
                this.f33047b.d = null;
                return;
            default:
                this.f33047b.f24332e = null;
                return;
        }
    }
}
