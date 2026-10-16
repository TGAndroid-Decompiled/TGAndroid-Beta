package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y91 extends AnimatorListenerAdapter {
    public final int f31201a;
    public final z91 f31202b;

    public y91(z91 z91Var, int i10) {
        this.f31201a = i10;
        this.f31202b = z91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31201a) {
            case 0:
                this.f31202b.f31529y = null;
                return;
            default:
                this.f31202b.f31529y = null;
                return;
        }
    }
}
