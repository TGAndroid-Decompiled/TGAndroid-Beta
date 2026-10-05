package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f29452a;
    public final rg0 f29453b;

    public og0(rg0 rg0Var, int i10) {
        this.f29452a = i10;
        this.f29453b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29452a) {
            case 0:
                this.f29453b.F = null;
                return;
            default:
                this.f29453b.u();
                return;
        }
    }
}
