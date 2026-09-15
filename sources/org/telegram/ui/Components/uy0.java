package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uy0 extends AnimatorListenerAdapter {
    public final int f28528a;
    public final Switch f28529b;

    public uy0(Switch r12, int i10) {
        this.f28528a = i10;
        this.f28529b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28528a) {
            case 0:
                this.f28529b.d = null;
                return;
            default:
                this.f28529b.e = null;
                return;
        }
    }
}
