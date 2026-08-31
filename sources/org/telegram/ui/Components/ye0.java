package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye0 extends AnimatorListenerAdapter {
    public final int f33499a;
    public final af0 f33500b;

    public ye0(af0 af0Var, int i10) {
        this.f33499a = i10;
        this.f33500b = af0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33499a) {
            case 0:
                this.f33500b.f25254s = null;
                return;
            default:
                this.f33500b.v = null;
                return;
        }
    }
}
