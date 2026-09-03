package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xy0 extends AnimatorListenerAdapter {
    public final int f33248a;
    public final Switch f33249b;

    public xy0(Switch r12, int i10) {
        this.f33248a = i10;
        this.f33249b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33248a) {
            case 0:
                this.f33249b.d = null;
                return;
            default:
                this.f33249b.f25046e = null;
                return;
        }
    }
}
