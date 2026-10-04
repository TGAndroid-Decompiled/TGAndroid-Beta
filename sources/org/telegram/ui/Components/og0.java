package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f29347a;
    public final rg0 f29348b;

    public og0(rg0 rg0Var, int i10) {
        this.f29347a = i10;
        this.f29348b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29347a) {
            case 0:
                this.f29348b.F = null;
                return;
            default:
                this.f29348b.u();
                return;
        }
    }
}
