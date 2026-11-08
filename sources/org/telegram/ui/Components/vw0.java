package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vw0 extends AnimatorListenerAdapter {
    public final int f39738a;
    public final Switch f39739b;

    public vw0(Switch r12, int i7) {
        this.f39738a = i7;
        this.f39739b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39738a) {
            case 0:
                this.f39739b.d = null;
                return;
            default:
                this.f39739b.f31558e = null;
                return;
        }
    }
}
