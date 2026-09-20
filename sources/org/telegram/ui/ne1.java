package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f36002a;
    public final oe1 f36003b;

    public ne1(oe1 oe1Var, int i10) {
        this.f36002a = i10;
        this.f36003b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36002a) {
            case 0:
                this.f36003b.h.f38075s.setVisibility(8);
                return;
            default:
                this.f36003b.h.f38069a.setVisibility(8);
                return;
        }
    }
}
