package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f29834a;
    public final Switch f29835b;

    public pz0(Switch r12, int i10) {
        this.f29834a = i10;
        this.f29835b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29834a) {
            case 0:
                this.f29835b.d = null;
                return;
            default:
                this.f29835b.f24337e = null;
                return;
        }
    }
}
