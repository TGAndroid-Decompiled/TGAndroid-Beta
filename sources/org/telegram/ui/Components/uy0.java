package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uy0 extends AnimatorListenerAdapter {
    public final int f28525a;
    public final Switch f28526b;

    public uy0(Switch r12, int i10) {
        this.f28525a = i10;
        this.f28526b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28525a) {
            case 0:
                this.f28526b.d = null;
                return;
            default:
                this.f28526b.e = null;
                return;
        }
    }
}
