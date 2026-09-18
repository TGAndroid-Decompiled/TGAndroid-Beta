package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg0 extends AnimatorListenerAdapter {
    public final int f23036a;
    public final fg0 f23037b;

    public cg0(fg0 fg0Var, int i10) {
        this.f23036a = i10;
        this.f23037b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23036a) {
            case 0:
                this.f23037b.F = null;
                return;
            default:
                this.f23037b.u();
                return;
        }
    }
}
