package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f28513a;
    public final of0 f28514b;

    public mf0(of0 of0Var, int i10) {
        this.f28513a = i10;
        this.f28514b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28513a) {
            case 0:
                this.f28514b.f29045s = null;
                return;
            default:
                this.f28514b.v = null;
                return;
        }
    }
}
