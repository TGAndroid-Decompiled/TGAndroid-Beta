package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f30268a;
    public final ue0 f30269b;

    public se0(ue0 ue0Var, int i10) {
        this.f30268a = i10;
        this.f30269b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30268a) {
            case 0:
                this.f30269b.f30875s = null;
                return;
            default:
                this.f30269b.v = null;
                return;
        }
    }
}
