package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f29346a;
    public final rg0 f29347b;

    public og0(rg0 rg0Var, int i10) {
        this.f29346a = i10;
        this.f29347b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29346a) {
            case 0:
                this.f29347b.F = null;
                return;
            default:
                this.f29347b.u();
                return;
        }
    }
}
