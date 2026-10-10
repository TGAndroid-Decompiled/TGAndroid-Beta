package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ca1 extends AnimatorListenerAdapter {
    public final int f25258a;
    public final da1 f25259b;

    public ca1(da1 da1Var, int i10) {
        this.f25258a = i10;
        this.f25259b = da1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25258a) {
            case 0:
                this.f25259b.f25634y = null;
                return;
            default:
                this.f25259b.f25634y = null;
                return;
        }
    }
}
