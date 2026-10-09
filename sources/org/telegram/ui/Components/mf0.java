package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f28828a;
    public final qf0 f28829b;

    public mf0(qf0 qf0Var, int i10) {
        this.f28828a = i10;
        this.f28829b = qf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28828a) {
            case 0:
                this.f28829b.f30161x = null;
                return;
            default:
                this.f28829b.f30162y = null;
                return;
        }
    }
}
