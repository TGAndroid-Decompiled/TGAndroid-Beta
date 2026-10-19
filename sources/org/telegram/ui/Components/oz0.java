package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oz0 extends AnimatorListenerAdapter {
    public final int f29123a;
    public final Switch f29124b;

    public oz0(Switch r12, int i10) {
        this.f29123a = i10;
        this.f29124b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29123a) {
            case 0:
                this.f29124b.d = null;
                return;
            default:
                this.f29124b.e = null;
                return;
        }
    }
}
