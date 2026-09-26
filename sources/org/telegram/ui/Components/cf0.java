package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf0 extends AnimatorListenerAdapter {
    public final int f23332a;
    public final ef0 f23333b;

    public cf0(ef0 ef0Var, int i10) {
        this.f23332a = i10;
        this.f23333b = ef0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23332a) {
            case 0:
                this.f23333b.f23952s = null;
                return;
            default:
                this.f23333b.v = null;
                return;
        }
    }
}
