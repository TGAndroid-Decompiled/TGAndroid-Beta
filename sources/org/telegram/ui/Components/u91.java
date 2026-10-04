package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u91 extends AnimatorListenerAdapter {
    public final int f31356a;
    public final v91 f31357b;

    public u91(v91 v91Var, int i10) {
        this.f31356a = i10;
        this.f31357b = v91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31356a) {
            case 0:
                this.f31357b.f31631y = null;
                return;
            default:
                this.f31357b.f31631y = null;
                return;
        }
    }
}
