package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f27066a;
    public final rg0 f27067b;

    public og0(rg0 rg0Var, int i10) {
        this.f27066a = i10;
        this.f27067b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27066a) {
            case 0:
                this.f27067b.F = null;
                return;
            default:
                this.f27067b.u();
                return;
        }
    }
}
