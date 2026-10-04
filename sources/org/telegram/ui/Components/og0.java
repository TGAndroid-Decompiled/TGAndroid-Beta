package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f29352a;
    public final rg0 f29353b;

    public og0(rg0 rg0Var, int i10) {
        this.f29352a = i10;
        this.f29353b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29352a) {
            case 0:
                this.f29353b.F = null;
                return;
            default:
                this.f29353b.u();
                return;
        }
    }
}
