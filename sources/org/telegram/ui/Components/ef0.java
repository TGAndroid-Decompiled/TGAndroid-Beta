package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25914a;
    public final if0 f25915b;

    public ef0(if0 if0Var, int i10) {
        this.f25914a = i10;
        this.f25915b = if0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25914a) {
            case 0:
                this.f25915b.f27226x = null;
                return;
            default:
                this.f25915b.f27227y = null;
                return;
        }
    }
}
