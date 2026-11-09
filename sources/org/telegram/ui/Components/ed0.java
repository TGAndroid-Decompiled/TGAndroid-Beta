package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f33365a;
    public final gd0 f33366b;

    public ed0(gd0 gd0Var, int i7) {
        this.f33365a = i7;
        this.f33366b = gd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33365a) {
            case 0:
                this.f33366b.f33938s = null;
                return;
            default:
                this.f33366b.f33939w = null;
                return;
        }
    }
}
