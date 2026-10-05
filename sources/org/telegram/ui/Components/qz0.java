package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qz0 extends AnimatorListenerAdapter {
    public final int f30298a;
    public final Switch f30299b;

    public qz0(Switch r12, int i10) {
        this.f30298a = i10;
        this.f30299b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30298a) {
            case 0:
                this.f30299b.d = null;
                return;
            default:
                this.f30299b.f24345e = null;
                return;
        }
    }
}
