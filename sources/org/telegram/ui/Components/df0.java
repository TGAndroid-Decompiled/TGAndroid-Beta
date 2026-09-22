package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class df0 extends AnimatorListenerAdapter {
    public final int f23678a;
    public final ff0 f23679b;

    public df0(ff0 ff0Var, int i10) {
        this.f23678a = i10;
        this.f23679b = ff0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23678a) {
            case 0:
                this.f23679b.f24222s = null;
                return;
            default:
                this.f23679b.v = null;
                return;
        }
    }
}
