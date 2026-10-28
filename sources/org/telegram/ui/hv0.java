package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hv0 extends AnimatorListenerAdapter {
    public final int f39995a;
    public final ov0 f39996b;

    public hv0(ov0 ov0Var, int i10) {
        this.f39995a = i10;
        this.f39996b = ov0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39995a) {
            case 0:
                this.f39996b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f39996b.R.setTranslationY(0.0f);
                return;
            default:
                ov0 ov0Var = this.f39996b;
                ov0Var.getClass();
                ov0Var.R.setTranslationY(0.0f);
                ov0Var.m0();
                return;
        }
    }
}
