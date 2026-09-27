package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f27088a;
    public final rg0 f27089b;

    public og0(rg0 rg0Var, int i10) {
        this.f27088a = i10;
        this.f27089b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27088a) {
            case 0:
                this.f27089b.F = null;
                return;
            default:
                this.f27089b.u();
                return;
        }
    }
}
