package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fz0 extends AnimatorListenerAdapter {
    public final int f24343a;
    public final Switch f24344b;

    public fz0(Switch r12, int i10) {
        this.f24343a = i10;
        this.f24344b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24343a) {
            case 0:
                this.f24344b.d = null;
                return;
            default:
                this.f24344b.e = null;
                return;
        }
    }
}
