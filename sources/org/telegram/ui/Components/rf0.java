package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rf0 extends AnimatorListenerAdapter {
    public final int f28828a;
    public final tf0 f28829b;

    public rf0(tf0 tf0Var, int i10) {
        this.f28828a = i10;
        this.f28829b = tf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28828a) {
            case 0:
                this.f28829b.f29374s = null;
                return;
            default:
                this.f28829b.v = null;
                return;
        }
    }
}
