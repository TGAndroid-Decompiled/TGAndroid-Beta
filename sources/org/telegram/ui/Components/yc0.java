package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yc0 extends AnimatorListenerAdapter {
    public final int f41973a;
    public final bd0 f41974b;

    public yc0(bd0 bd0Var, int i7) {
        this.f41973a = i7;
        this.f41974b = bd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41973a) {
            case 0:
                this.f41974b.f33260x1 = null;
                return;
            default:
                this.f41974b.f33261y1 = null;
                return;
        }
    }
}
