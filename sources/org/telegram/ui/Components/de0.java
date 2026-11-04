package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class de0 extends AnimatorListenerAdapter {
    public final int f33060a;
    public final ie0 f33061b;

    public de0(ie0 ie0Var, int i3) {
        this.f33060a = i3;
        this.f33061b = ie0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33060a) {
            case 0:
                this.f33061b.G = null;
                return;
            default:
                this.f33061b.u();
                return;
        }
    }
}
