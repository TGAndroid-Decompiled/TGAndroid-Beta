package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24722a;
    public final eg0 f24723b;

    public bg0(eg0 eg0Var, int i10) {
        this.f24722a = i10;
        this.f24723b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24722a) {
            case 0:
                this.f24723b.F = null;
                return;
            default:
                this.f24723b.u();
                return;
        }
    }
}
