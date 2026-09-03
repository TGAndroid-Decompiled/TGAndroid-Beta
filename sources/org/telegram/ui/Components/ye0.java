package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye0 extends AnimatorListenerAdapter {
    public final int f33520a;
    public final af0 f33521b;

    public ye0(af0 af0Var, int i10) {
        this.f33520a = i10;
        this.f33521b = af0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33520a) {
            case 0:
                this.f33521b.f25246s = null;
                return;
            default:
                this.f33521b.v = null;
                return;
        }
    }
}
