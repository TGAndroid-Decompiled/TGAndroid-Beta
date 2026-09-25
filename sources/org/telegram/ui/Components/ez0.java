package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ez0 extends AnimatorListenerAdapter {
    public final int f24023a;
    public final Switch f24024b;

    public ez0(Switch r12, int i10) {
        this.f24023a = i10;
        this.f24024b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24023a) {
            case 0:
                this.f24024b.d = null;
                return;
            default:
                this.f24024b.e = null;
                return;
        }
    }
}
