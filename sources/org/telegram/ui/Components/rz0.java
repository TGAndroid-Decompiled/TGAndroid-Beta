package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rz0 extends AnimatorListenerAdapter {
    public final int f30386a;
    public final Switch f30387b;

    public rz0(Switch r12, int i10) {
        this.f30386a = i10;
        this.f30387b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30386a) {
            case 0:
                this.f30387b.d = null;
                return;
            default:
                this.f30387b.e = null;
                return;
        }
    }
}
