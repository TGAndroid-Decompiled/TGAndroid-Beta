package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg0 extends AnimatorListenerAdapter {
    public final int f35324a;
    public final ch0 f35325b;

    public zg0(ch0 ch0Var, int i10) {
        this.f35324a = i10;
        this.f35325b = ch0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35324a) {
            case 0:
                this.f35325b.F = null;
                return;
            default:
                this.f35325b.u();
                return;
        }
    }
}
