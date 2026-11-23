package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx0 extends AnimatorListenerAdapter {
    public final int f35565a;
    public final Switch f35566b;

    public gx0(Switch r12, int i7) {
        this.f35565a = i7;
        this.f35566b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35565a) {
            case 0:
                this.f35566b.d = null;
                return;
            default:
                this.f35566b.f33236e = null;
                return;
        }
    }
}
