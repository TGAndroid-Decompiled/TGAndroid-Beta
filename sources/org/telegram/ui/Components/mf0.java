package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f28514a;
    public final of0 f28515b;

    public mf0(of0 of0Var, int i10) {
        this.f28514a = i10;
        this.f28515b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28514a) {
            case 0:
                this.f28515b.f29046s = null;
                return;
            default:
                this.f28515b.v = null;
                return;
        }
    }
}
