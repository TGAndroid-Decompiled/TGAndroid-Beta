package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg0 extends AnimatorListenerAdapter {
    public final int f23033a;
    public final fg0 f23034b;

    public cg0(fg0 fg0Var, int i10) {
        this.f23033a = i10;
        this.f23034b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23033a) {
            case 0:
                this.f23034b.F = null;
                return;
            default:
                this.f23034b.u();
                return;
        }
    }
}
