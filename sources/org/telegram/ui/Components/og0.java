package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f27078a;
    public final rg0 f27079b;

    public og0(rg0 rg0Var, int i10) {
        this.f27078a = i10;
        this.f27079b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27078a) {
            case 0:
                this.f27079b.F = null;
                return;
            default:
                this.f27079b.u();
                return;
        }
    }
}
