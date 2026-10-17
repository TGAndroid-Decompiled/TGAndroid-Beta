package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p91 extends AnimatorListenerAdapter {
    public final int f29243a;
    public final q91 f29244b;

    public p91(q91 q91Var, int i10) {
        this.f29243a = i10;
        this.f29244b = q91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29243a) {
            case 0:
                this.f29244b.f29616y = null;
                return;
            default:
                this.f29244b.f29616y = null;
                return;
        }
    }
}
