package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f24963a;
    public final Switch f24964b;

    public hz0(Switch r12, int i10) {
        this.f24963a = i10;
        this.f24964b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24963a) {
            case 0:
                this.f24964b.d = null;
                return;
            default:
                this.f24964b.e = null;
                return;
        }
    }
}
