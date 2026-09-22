package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f36023a;
    public final oe1 f36024b;

    public ne1(oe1 oe1Var, int i10) {
        this.f36023a = i10;
        this.f36024b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36023a) {
            case 0:
                this.f36024b.h.f38076s.setVisibility(8);
                return;
            default:
                this.f36024b.h.f38070a.setVisibility(8);
                return;
        }
    }
}
