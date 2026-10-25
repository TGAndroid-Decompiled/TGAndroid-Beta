package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f29917a;
    public final lg0 f29918b;

    public kg0(lg0 lg0Var, int i10) {
        this.f29917a = i10;
        this.f29918b = lg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29917a) {
            case 0:
                this.f29918b.f30206a.f30576n.setVisibility(8);
                return;
            default:
                this.f29918b.f30206a.h.setVisibility(8);
                return;
        }
    }
}
