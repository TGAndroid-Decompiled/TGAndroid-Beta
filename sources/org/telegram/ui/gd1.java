package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gd1 extends AnimatorListenerAdapter {
    public final int f38514a;
    public final kd1 f38515b;

    public gd1(kd1 kd1Var, int i9) {
        this.f38514a = i9;
        this.f38515b = kd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38514a) {
            case 0:
                kd1 kd1Var = this.f38515b;
                kd1Var.v = 0;
                kd1Var.f39813n.setVisibility(8);
                return;
            case 1:
                this.f38515b.v = 0;
                return;
            default:
                this.f38515b.B.setVisibility(8);
                return;
        }
    }
}
