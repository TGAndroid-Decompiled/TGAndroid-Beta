package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f28336a;
    public final Switch f28337b;

    public ty0(Switch r12, int i10) {
        this.f28336a = i10;
        this.f28337b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28336a) {
            case 0:
                this.f28337b.d = null;
                return;
            default:
                this.f28337b.e = null;
                return;
        }
    }
}
