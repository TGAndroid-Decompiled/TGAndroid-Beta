package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f28509a;
    public final of0 f28510b;

    public mf0(of0 of0Var, int i10) {
        this.f28509a = i10;
        this.f28510b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28509a) {
            case 0:
                this.f28510b.f29041s = null;
                return;
            default:
                this.f28510b.v = null;
                return;
        }
    }
}
