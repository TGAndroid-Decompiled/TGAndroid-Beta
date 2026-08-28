package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f35281a;
    public final be0 f35282b;

    public zd0(be0 be0Var, int i9) {
        this.f35281a = i9;
        this.f35282b = be0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35281a) {
            case 0:
                this.f35282b.f27189s = null;
                return;
            default:
                this.f35282b.v = null;
                return;
        }
    }
}
