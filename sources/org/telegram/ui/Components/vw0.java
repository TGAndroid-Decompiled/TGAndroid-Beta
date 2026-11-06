package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39695a;
    public final Switch f39696b;

    public vw0(Switch r12, int i7) {
        this.f39695a = i7;
        this.f39696b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39695a) {
            case 0:
                this.f39696b.d = null;
                return;
            default:
                this.f39696b.f31553e = null;
                return;
        }
    }
}
