package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yc0 extends AnimatorListenerAdapter {
    public final int f40682a;
    public final ad0 f40683b;

    public yc0(ad0 ad0Var, int i3) {
        this.f40682a = i3;
        this.f40683b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40682a) {
            case 0:
                this.f40683b.f31814s = null;
                return;
            default:
                this.f40683b.f31815w = null;
                return;
        }
    }
}
