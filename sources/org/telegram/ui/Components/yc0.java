package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yc0 extends AnimatorListenerAdapter {
    public final int f41975a;
    public final bd0 f41976b;

    public yc0(bd0 bd0Var, int i7) {
        this.f41975a = i7;
        this.f41976b = bd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41975a) {
            case 0:
                this.f41976b.f33263x1 = null;
                return;
            default:
                this.f41976b.f33264y1 = null;
                return;
        }
    }
}
