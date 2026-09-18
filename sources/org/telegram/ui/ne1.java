package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f36089a;
    public final oe1 f36090b;

    public ne1(oe1 oe1Var, int i10) {
        this.f36089a = i10;
        this.f36090b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36089a) {
            case 0:
                this.f36090b.h.f38063s.setVisibility(8);
                return;
            default:
                this.f36090b.h.f38057a.setVisibility(8);
                return;
        }
    }
}
