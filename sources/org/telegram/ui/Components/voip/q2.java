package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q2 extends AnimatorListenerAdapter {
    public final int f33942a;
    public final r2 f33943b;

    public q2(r2 r2Var, int i10) {
        this.f33942a = i10;
        this.f33943b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33942a) {
            case 0:
                this.f33943b.f33970b.setVisibility(8);
                return;
            default:
                this.f33943b.f33971c.setVisibility(8);
                return;
        }
    }
}
