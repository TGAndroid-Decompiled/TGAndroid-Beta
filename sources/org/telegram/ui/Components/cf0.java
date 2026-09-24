package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf0 extends AnimatorListenerAdapter {
    public final int f23322a;
    public final ef0 f23323b;

    public cf0(ef0 ef0Var, int i10) {
        this.f23322a = i10;
        this.f23323b = ef0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23322a) {
            case 0:
                this.f23323b.f23936s = null;
                return;
            default:
                this.f23323b.v = null;
                return;
        }
    }
}
