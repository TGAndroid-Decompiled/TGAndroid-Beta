package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sc0 extends AnimatorListenerAdapter {
    public final int f37983a;
    public final vc0 f37984b;

    public sc0(vc0 vc0Var, int i3) {
        this.f37983a = i3;
        this.f37984b = vc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37983a) {
            case 0:
                this.f37984b.f39075u1 = null;
                return;
            default:
                this.f37984b.f39076v1 = null;
                return;
        }
    }
}
