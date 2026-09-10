package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f23458a;
    public final Switch f23459b;

    public gz0(Switch r12, int i10) {
        this.f23458a = i10;
        this.f23459b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23458a) {
            case 0:
                this.f23459b.d = null;
                return;
            default:
                this.f23459b.e = null;
                return;
        }
    }
}
