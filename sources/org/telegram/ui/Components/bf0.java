package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf0 extends AnimatorListenerAdapter {
    public final int f21820a;
    public final df0 f21821b;

    public bf0(df0 df0Var, int i10) {
        this.f21820a = i10;
        this.f21821b = df0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21820a) {
            case 0:
                this.f21821b.f22410s = null;
                return;
            default:
                this.f21821b.v = null;
                return;
        }
    }
}
