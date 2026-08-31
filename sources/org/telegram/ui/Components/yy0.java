package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yy0 extends AnimatorListenerAdapter {
    public final int f33651a;
    public final Switch f33652b;

    public yy0(Switch r12, int i10) {
        this.f33651a = i10;
        this.f33652b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33651a) {
            case 0:
                this.f33652b.d = null;
                return;
            default:
                this.f33652b.f25044e = null;
                return;
        }
    }
}
