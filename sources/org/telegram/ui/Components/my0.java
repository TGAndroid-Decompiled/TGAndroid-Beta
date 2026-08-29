package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class my0 extends AnimatorListenerAdapter {
    public final int f30781a;
    public final Switch f30782b;

    public my0(Switch r12, int i10) {
        this.f30781a = i10;
        this.f30782b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30781a) {
            case 0:
                this.f30782b.d = null;
                return;
            default:
                this.f30782b.f26556e = null;
                return;
        }
    }
}
