package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf0 extends AnimatorListenerAdapter {
    public final int f23333a;
    public final ef0 f23334b;

    public cf0(ef0 ef0Var, int i10) {
        this.f23333a = i10;
        this.f23334b = ef0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23333a) {
            case 0:
                this.f23334b.f23953s = null;
                return;
            default:
                this.f23334b.v = null;
                return;
        }
    }
}
