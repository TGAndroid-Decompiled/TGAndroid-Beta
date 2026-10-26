package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg0 extends AnimatorListenerAdapter {
    public final int f35327a;
    public final ch0 f35328b;

    public zg0(ch0 ch0Var, int i10) {
        this.f35327a = i10;
        this.f35328b = ch0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35327a) {
            case 0:
                this.f35328b.F = null;
                return;
            default:
                this.f35328b.u();
                return;
        }
    }
}
