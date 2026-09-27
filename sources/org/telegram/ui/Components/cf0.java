package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cf0 extends AnimatorListenerAdapter {
    public final int f23315a;
    public final ef0 f23316b;

    public cf0(ef0 ef0Var, int i10) {
        this.f23315a = i10;
        this.f23316b = ef0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23315a) {
            case 0:
                this.f23316b.f24059s = null;
                return;
            default:
                this.f23316b.v = null;
                return;
        }
    }
}
