package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f30295a;
    public final ue0 f30296b;

    public se0(ue0 ue0Var, int i10) {
        this.f30295a = i10;
        this.f30296b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30295a) {
            case 0:
                this.f30296b.f30902s = null;
                return;
            default:
                this.f30296b.v = null;
                return;
        }
    }
}
