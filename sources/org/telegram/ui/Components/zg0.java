package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg0 extends AnimatorListenerAdapter {
    public final int f33259a;
    public final ch0 f33260b;

    public zg0(ch0 ch0Var, int i10) {
        this.f33259a = i10;
        this.f33260b = ch0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33259a) {
            case 0:
                this.f33260b.F = null;
                return;
            default:
                this.f33260b.u();
                return;
        }
    }
}
