package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f28875a;
    public final ke0 f28876b;

    public ge0(ke0 ke0Var, int i10) {
        this.f28875a = i10;
        this.f28876b = ke0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28875a) {
            case 0:
                this.f28876b.f30031x = null;
                return;
            default:
                this.f28876b.f30032y = null;
                return;
        }
    }
}
