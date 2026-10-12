package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y70 extends AnimatorListenerAdapter {
    public final int f31507a;
    public final z70 f31508b;

    public y70(z70 z70Var, int i10) {
        this.f31507a = i10;
        this.f31508b = z70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31507a) {
            case 0:
                z70 z70Var = this.f31508b;
                z70Var.e.f23469d0 = null;
                z70Var.requestLayout();
                return;
            default:
                z70 z70Var2 = this.f31508b;
                z70Var2.e.f23469d0 = null;
                z70Var2.f31787a = false;
                return;
        }
    }
}
