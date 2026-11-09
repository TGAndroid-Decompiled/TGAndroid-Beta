package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h71 extends AnimatorListenerAdapter {
    public final int f34228a;
    public final i71 f34229b;

    public h71(i71 i71Var, int i7) {
        this.f34228a = i7;
        this.f34229b = i71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34228a) {
            case 0:
                this.f34229b.D = null;
                return;
            default:
                this.f34229b.D = null;
                return;
        }
    }
}
