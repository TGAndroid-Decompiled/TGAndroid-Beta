package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nz0 extends AnimatorListenerAdapter {
    public final int f28851a;
    public final Switch f28852b;

    public nz0(Switch r12, int i10) {
        this.f28851a = i10;
        this.f28852b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28851a) {
            case 0:
                this.f28852b.d = null;
                return;
            default:
                this.f28852b.e = null;
                return;
        }
    }
}
