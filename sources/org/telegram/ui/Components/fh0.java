package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fh0 extends AnimatorListenerAdapter {
    public final int f26353a;
    public final ih0 f26354b;

    public fh0(ih0 ih0Var, int i10) {
        this.f26353a = i10;
        this.f26354b = ih0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26353a) {
            case 0:
                this.f26354b.F = null;
                return;
            default:
                this.f26354b.u();
                return;
        }
    }
}
